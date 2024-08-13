package com.project.marketapi;

@RestController
@RequestMapping("/saludar")
public class HolaMundoController {

    @GetMapping("/hola")
    public string saludar() {
        return "HOLA MUNDO!";
    }

}
