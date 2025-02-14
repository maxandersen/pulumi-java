// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.transcoder_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.transcoder_v1.outputs.PreprocessingConfigResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InputResponse {
    /**
     * @return A unique key for this input. Must be specified when using advanced mapping and edit lists.
     * 
     */
    private final String key;
    /**
     * @return Preprocessing configurations.
     * 
     */
    private final PreprocessingConfigResponse preprocessingConfig;
    /**
     * @return URI of the media. Input files must be at least 5 seconds in duration and stored in Cloud Storage (for example, `gs://bucket/inputs/file.mp4`). If empty, the value is populated from `Job.input_uri`. See [Supported input and output formats](https://cloud.google.com/transcoder/docs/concepts/supported-input-and-output-formats).
     * 
     */
    private final String uri;

    @CustomType.Constructor
    private InputResponse(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("preprocessingConfig") PreprocessingConfigResponse preprocessingConfig,
        @CustomType.Parameter("uri") String uri) {
        this.key = key;
        this.preprocessingConfig = preprocessingConfig;
        this.uri = uri;
    }

    /**
     * @return A unique key for this input. Must be specified when using advanced mapping and edit lists.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Preprocessing configurations.
     * 
     */
    public PreprocessingConfigResponse preprocessingConfig() {
        return this.preprocessingConfig;
    }
    /**
     * @return URI of the media. Input files must be at least 5 seconds in duration and stored in Cloud Storage (for example, `gs://bucket/inputs/file.mp4`). If empty, the value is populated from `Job.input_uri`. See [Supported input and output formats](https://cloud.google.com/transcoder/docs/concepts/supported-input-and-output-formats).
     * 
     */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private PreprocessingConfigResponse preprocessingConfig;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(InputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.preprocessingConfig = defaults.preprocessingConfig;
    	      this.uri = defaults.uri;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder preprocessingConfig(PreprocessingConfigResponse preprocessingConfig) {
            this.preprocessingConfig = Objects.requireNonNull(preprocessingConfig);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public InputResponse build() {
            return new InputResponse(key, preprocessingConfig, uri);
        }
    }
}
