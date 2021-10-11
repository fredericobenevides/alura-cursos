(ns estoque.aula3)

(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for estritamente maior que 100."
  [valor-bruto]
  (if (> valor-bruto 100)
    (let [taxa-de-desconto (/ 10 100)
          desconto         (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

;(println (valor-descontado 1000))

;(println (valor-descontado 100))




(defn deve-aplicar-desconto?
  [valor-bruto]
  (if (> valor-bruto 100)
    true
    false))

(println (deve-aplicar-desconto? 1000))
(println (deve-aplicar-desconto? 100))

(defn aplica-desconto?
  [valor-bruto]
  (if (> valor-bruto 100)
    true
    false))

(println (deve-aplicar-desconto? 1000))
(println (deve-aplicar-desconto? 100))

(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for estritamente maior que 100."
  [valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto         (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(println (valor-descontado 1000))
(println (valor-descontado 100))

(defn aplica-desconto?
  [valor-bruto]
  (> valor-bruto 100))

(println (deve-aplicar-desconto? 1000))
(println (deve-aplicar-desconto? 100))

(defn mais-caro-que-100?
  [valor-bruto]
  (> valor-bruto 100))

(defn valor-descontado
  "Retorna o valor com desconto de 10% se deve aplicar desconto"
  [aplica? valor-bruto]
  (if (aplica? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto         (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(println "função com parametrok")
(println (valor-descontado mais-caro-que-100? 1000))
(println (valor-descontado mais-caro-que-100? 100))

(defn mais-caro-que-100? [valor-bruto] (> valor-bruto 100))

(println "função com sem nome")
(fn [valor-bruto] (> valor-bruto 100))
(println (valor-descontado (fn [valor-bruto] (> valor-bruto 100)) 1000))
(println (valor-descontado (fn [valor-bruto] (> valor-bruto 100)) 100))
(println (valor-descontado (fn [v] (> v 100)) 100))
(println (valor-descontado (fn [v] (> v 100)) 100))
(println (valor-descontado #(> % 100) 100))
(println (valor-descontado #(> % 100) 100))

(def mais-caro-que-100? (fn [valor-bruto] (> valor-bruto 100)))
(def mais-caro-que-100? #(> % 100))
(println (valor-descontado mais-caro-que-100? 1000))
(println (valor-descontado mais-caro-que-100? 100))

