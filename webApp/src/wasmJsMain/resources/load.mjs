import { instantiate } from './webApp.uninstantiated.mjs';

await wasmSetup;

instantiate({ skia: Module['asm'] });
