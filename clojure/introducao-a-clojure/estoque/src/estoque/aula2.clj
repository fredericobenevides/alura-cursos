(ns estoque.aula2)

(defn imprime-mensagem []
  (println "--------------------")
  (println "Bem vindo ao estoque!"))

(imprime-mensagem)



(defn aplica-desconto [valor-bruto]
  (* valor-bruto 0.9))


(println
  (aplica-desconto 100))


(defn valor-descontado
  "Retorna o valor descontado que é 90% do valor bruto"
  [valor-bruto]
  (* valor-bruto 0.9))

(valor-descontado 1000)


(defn valor-descontado
  "Retorna o valor com desconto de 10%"
  [valor-bruto]
  (* valor-bruto (- 1 0.1)))


(valor-descontado 1000)


(defn valor-descontado
  "Retorna o valor com desconto de 10%"
  [valor-bruto]
  (def desconto 0.10)
  (* valor-bruto (- 1 desconto)))


(valor-descontado 1000)


(defn valor-descontado
  "Retorna o valor com desconto de 10%"
  [valor-bruto]
  (let [desconto 0.10]
    (* valor-bruto (- 1 desconto))))


(valor-descontado 1000)

(defn valor-descontado
  "Retorna o valor com desconto de 10%"
  [valor-bruto]
  (let [desconto (/ 10 100)]
    (* valor-bruto (- 1 desconto))))


(valor-descontado 1000)


(defn valor-descontado
  "Retorna o valor com desconto de 10%"
  [valor-bruto]
  (let [taxa-de-desconto (/ 10 100)
        desconto       (* valor-bruto taxa-de-desconto)]
    (println "Calculando desconto de " desconto)
    (- valor-bruto desconto)))


(valor-descontado 1000)




(> 500 100)
(< 500 100)

(if (> 500 100)
  (println "maior")
  (println "menor ou igual"))

(if (> 50 100)
  (println "maior")
  (println "menor ou igual"))



(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for estritamente maior que 100."
  [valor-bruto]
  (if (> valor-bruto 100)
    (let [taxa-de-desconto (/ 10 100)
          desconto       (* valor-bruto taxa-de-desconto)]
      (println "Calculando desconto de " desconto)
      (- valor-bruto desconto))
    (valor-bruto)))

(valor-descontado 1000)