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

## How AI helps in Computer Vision

- Common uses of computer vision include :
  - Auto-captioning or tag-generation for photographs
  - Visual search
  - Monitoring stock levels or Identifying items for checkout in retail scenarios.
  - Security video monitoring.
  - Authentication through facial recognition
  - Robotics and self-driving car
- You can combine computer vision and language models to create a multi-modal model that combines computer vision and generative AI capabilities.
- Semantic segmentation is a computer vision technique used to classify each pixel in an image into a specific category. It is commonly used in image processing and deep learning to understand the structure of an image at a fine-grained level.
