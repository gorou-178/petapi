package com.example.petapi.controller;

import com.example.petapi.adapter.controller.PetApi;
import com.example.petapi.domain.model.Category;
import com.example.petapi.domain.model.ModelApiResponse;
import com.example.petapi.domain.model.Pet;
import com.example.petapi.domain.model.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/pet")
public class PetController implements PetApi {

    @PostMapping("/")
    @Override
    public ResponseEntity<Pet> addPet(Pet pet) {
        return ResponseEntity.ok(new Pet("addDog", Collections.emptyList()));
    }

    @DeleteMapping("/")
    @Override
    public ResponseEntity<Void> deletePet(Long petId, String apiKey) {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/findStatus")
    @Override
    public ResponseEntity<List<Pet>> findPetsByStatus(List<String> status) {
        return ResponseEntity.ok(List.of(new Pet("dog2", Collections.emptyList())));
    }

    @GetMapping("/findTags")
    @Override
    public ResponseEntity<List<Pet>> findPetsByTags(List<String> tags) {
        throw new UnsupportedOperationException("findPetsByTags error");
    }

    @Override
    @GetMapping("/{petId}")
    public ResponseEntity<Pet> getPetById(@PathVariable Long petId) {
        Category dogCategory = new Category();
        dogCategory.id(100L);
        dogCategory.name("dog");
        Pet pet = new Pet("dog", Collections.emptyList());
        pet.id(100L);
        pet.category(dogCategory);
        pet.status(Pet.StatusEnum.AVAILABLE);
        Tag tag = new Tag();
        tag.id(200L);
        tag.name("pet");
        pet.tags(List.of(tag));
        return ResponseEntity.ok(pet);
    }

    @PutMapping("/")
    @Override
    public ResponseEntity<Pet> updatePet(Pet pet) {
        return ResponseEntity.ok(new Pet("cat", Collections.emptyList()));
    }

    @Override
    public ResponseEntity<Void> updatePetWithForm(Long petId, String name, String status) {
        throw new UnsupportedOperationException("updatePetWithForm error");
    }

    @Override
    public ResponseEntity<ModelApiResponse> uploadFile(Long petId, String additionalMetadata, MultipartFile file) {
        throw new UnsupportedOperationException("uploadFile error");
    }
}
