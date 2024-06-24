**Table of content:**

- [RAG](#rag)
- [GitHubCoPilot](#gitcopilot)

<a id="gitcopilot"></a>

#### Github Co-Pilot

- GitHub Copilot is the world's first at-scale AI developer tool that can help you write code faster with less work.
- OpenAI created GitHub Copilot's generative pretrained language model, powered by OpenAI Codex.
-

<a id="rag"></a>

#### [RAG](https://medium.com/@imabhi1216/implementing-rag-using-langchain-and-ollama-93bdf4a9027c)

- Retrievla Augmented Generation
- Remember the example of exam with open book (RAG) and appearing exam which has some out of syllabus questions (LLM)
- RAG overcomes certain drwbacks of LLMs like hallucination,limited training data , blackbox outputs
- No model across various modalities like computer vision and speech recognition has ever seen their corresponding inputs as image, v
  video, and audio, respectively.
- All the inputs are first processed and converted into a mathematical representation; let’s say text will be converted into embeddings,
  images will be converted into the matrix, and the audio signal is converted to a spectrogram
- Steps for RAG => Chunking,Embedding,Storing in vector database LLMs search it in vector db
- Implementation using Langchain for embedding and llama for generating text locally
