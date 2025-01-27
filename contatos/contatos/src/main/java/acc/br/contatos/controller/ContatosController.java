package acc.br.contatos.controller;

import acc.br.contatos.model.Contato;
import acc.br.contatos.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContatosController {

    @Autowired
    private ContatoRepository contatoRepository;

    @GetMapping("/contatos")
    public String listarContatos(Model model) {
        model.addAttribute("contatos", contatoRepository.findAll());
        return "contatos";
    }

    @GetMapping("/contatos/novo")
    public String exibirFormulario(Model model) {
        model.addAttribute("contato", new Contato());
        return "formularioContato";
    }

    @PostMapping("/contatos/novo")
    public String salvarContato(@ModelAttribute Contato contato) {
        contatoRepository.save(contato);
        return "redirect:/contatos";
    }
}



