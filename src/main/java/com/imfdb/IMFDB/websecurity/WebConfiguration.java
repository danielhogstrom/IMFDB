//package com.imfdb.IMFDB.websecurity;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//
//@Configuration
//@EnableWebSecurity
//public class WebConfiguration extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers("/", "/movie/{[0-100]}", "/filterby/{genre}", "/styles.css", "/webjars/**","/search/**").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .permitAll()
//                .and()
//                .logout()
//                .logoutSuccessUrl("/");
//        http.csrf().disable();
//    }
//    @Bean
//    public UserDetailsService userDetailsService() {
//        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//        manager.createUser(User
//                .withUsername("Daniel")
//                .password(encoder().encode("daniel"))
//                .roles("ADMIN").build());
//        manager.createUser(User
//                .withUsername("Theo")
//                .password(encoder().encode("theo"))
//                .roles("ADMIN").build());
//        manager.createUser(User
//                .withUsername("Anne")
//                .password(encoder().encode("anne"))
//                .roles("ADMIN").build());
//        manager.createUser(User
//                .withUsername("Johannes")
//                .password(encoder().encode("johannes"))
//                .roles("ADMIN").build());
//        manager.createUser(User
//                .withUsername("Stina-Lise")
//                .password(encoder().encode("stina-lise"))
//                .roles("ADMIN").build());
//        return manager;
//    }
//    @Bean
//    public PasswordEncoder encoder() {
//        return new BCryptPasswordEncoder();
//    }
//}
