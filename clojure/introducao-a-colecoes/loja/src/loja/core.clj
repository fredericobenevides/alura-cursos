(ns loja.core)

;["daniela" "guilherme" "carlos" "paulo" "lucia" "ana"]
;{"guilherme" 37 "paulo" 39}
;'(1 2 3 4 5)
;[[0 1]]
;#{}

;map
;reduce
;filter

; loop
; for

(map println ["daniela" "guilherme" "carlos" "paulo" "lucia" "ana"])
(println (first ["daniela" "guilherme" "carlos" "paulo" "lucia" "ana"]))
(println (rest ["daniela" "guilherme" "carlos" "paulo" "lucia" "ana"]))
(println (rest []))
(println (next ["daniela" "guilherme" "carlos" "paulo" "lucia" "ana"]))
(println (next []))
(println (seq []))
(println (seq [1 2 3 5]))




(println "\n\n\n\nMEU MAPA")

(defn meu-mapa
  [funcao sequencia]
  (let [primeiro (first sequencia)]
    (funcao primeiro)
    (meu-mapa funcao (rest sequencia))))

(meu-mapa println ["daniela" "guilherme" "carlos" "paulo" "lucia" "ana"])

