module br.ifsudestemg.too {
    // 1. Módulos que seu projeto consome (Dependências)
    // O java.base é importado automaticamente, mas outros precisam ser declarados:
    requires java.desktop; // Necessário para usar a Classe Math (2.7) e GUIs futuramente
    requires java.logging; // Útil para logs e tratamento de exceções (9.1)

    // 2. Pacotes que seu projeto exporta (Visibilidade)
    // Isso permite que outros módulos acessem suas classes
    exports br.ifsudestemg.too.cap02.estrutura;
    exports br.ifsudestemg.too.cap02.variaveis;
    exports br.ifsudestemg.too.cap02.operadores;
    exports br.ifsudestemg.too.cap02.controle;
}