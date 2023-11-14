R Markdown Homework Assignment
================
Urbán Eszter Klára, HI4SQE

First, let’s display some system information:

    ## "Machine type: AMD64

    ## Node name: DESKTOP-K133OID

    ## OS name: Windows

    ## OS release: 10

    ## OS version: 10.0.19044

    ## User name: Asus

    ## Home directory: C:\Users\Asus

    ## Current directory: C:\Users\Asus\Desktop\EGYETEM\3.felev\webtech\rmarkdown-assignment-eszterurban-master

    ## PATH: C:\Users\Asus\miniconda3;C:\Users\Asus\miniconda3\Library\mingw-w64\bin;C:\Users\Asus\miniconda3\Library\usr\bin;C:\Users\Asus\miniconda3\Library\bin;C:\Users\Asus\miniconda3\Scripts;C:\Users\Asus\miniconda3\bin;C:\Users\Asus\miniconda3\condabin;C:\ProgramData\Oracle\Java\javapath;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0;C:\Windows\System32\OpenSSH;C:\Program Files\Microsoft SQL Server\130\Tools\Binn;C:\Program Files\MATLAB\R2021b\bin;C:\Users\Asus\miniconda3;C:\Users\Asus\miniconda3\Library\mingw-w64\bin;C:\Users\Asus\miniconda3\Library\usr\bin;C:\Users\Asus\miniconda3\Library\bin;C:\Users\Asus\miniconda3\Scripts;C:\Users\Asus\AppData\Local\Microsoft\WindowsApps;C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2.1\bin;.;C:\Users\Asus\AppData\Local\Programs\Microsoft VS Code\bin

Let’s create a word cloud of the complete Sherlock Holmes Canon that is
available in plain text from
[here](https://sherlock-holm.es/stories/plain-text/cano.txt).

The word cloud can be generated with the
[word_cloud](https://github.com/amueller/word_cloud) package as follows:

``` python
from wordcloud import WordCloud, STOPWORDS
import urllib.request
from PIL import Image
import numpy as np

text = urllib.request.urlopen('https://sherlock-holm.es/stories/plain-text/cano.txt').read().decode('utf-8')

stopwords = set(STOPWORDS)
stopwords.add("said")

mask = np.array(Image.open('detectiveHat.png'))

wordcloud = WordCloud(stopwords=stopwords, collocations=False, mask=mask, margin=0, background_color='white').generate(text)

import matplotlib.pyplot as plt
plt.imshow(wordcloud, interpolation='bilinear')
plt.axis("off")
```

    ## (-0.5, 900.5, 485.5, -0.5)

``` python
plt.show()
```

![](wordcloud-1.png)<!-- -->

This document was generated on October 03, 2022 at 17:42:46.
