// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebaseml_v1beta2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Information that is specific to TfLite models.
 * 
 */
public final class TfLiteModelResponse extends io.pulumi.resources.InvokeArgs {

    public static final TfLiteModelResponse Empty = new TfLiteModelResponse();

    /**
     * The AutoML model id referencing a model you created with the AutoML API. The name should have format 'projects//locations//models/' (This is the model resource name returned from the AutoML API)
     * 
     */
    @Import(name="automlModel", required=true)
      private final String automlModel;

    public String automlModel() {
        return this.automlModel;
    }

    /**
     * The TfLite file containing the model. (Stored in Google Cloud). The gcs_tflite_uri should have form: gs://some-bucket/some-model.tflite Note: If you update the file in the original location, it is necessary to call UpdateModel for ML to pick up and validate the updated file.
     * 
     */
    @Import(name="gcsTfliteUri", required=true)
      private final String gcsTfliteUri;

    public String gcsTfliteUri() {
        return this.gcsTfliteUri;
    }

    /**
     * The size of the TFLite model
     * 
     */
    @Import(name="sizeBytes", required=true)
      private final String sizeBytes;

    public String sizeBytes() {
        return this.sizeBytes;
    }

    public TfLiteModelResponse(
        String automlModel,
        String gcsTfliteUri,
        String sizeBytes) {
        this.automlModel = Objects.requireNonNull(automlModel, "expected parameter 'automlModel' to be non-null");
        this.gcsTfliteUri = Objects.requireNonNull(gcsTfliteUri, "expected parameter 'gcsTfliteUri' to be non-null");
        this.sizeBytes = Objects.requireNonNull(sizeBytes, "expected parameter 'sizeBytes' to be non-null");
    }

    private TfLiteModelResponse() {
        this.automlModel = null;
        this.gcsTfliteUri = null;
        this.sizeBytes = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TfLiteModelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String automlModel;
        private String gcsTfliteUri;
        private String sizeBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(TfLiteModelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automlModel = defaults.automlModel;
    	      this.gcsTfliteUri = defaults.gcsTfliteUri;
    	      this.sizeBytes = defaults.sizeBytes;
        }

        public Builder automlModel(String automlModel) {
            this.automlModel = Objects.requireNonNull(automlModel);
            return this;
        }
        public Builder gcsTfliteUri(String gcsTfliteUri) {
            this.gcsTfliteUri = Objects.requireNonNull(gcsTfliteUri);
            return this;
        }
        public Builder sizeBytes(String sizeBytes) {
            this.sizeBytes = Objects.requireNonNull(sizeBytes);
            return this;
        }        public TfLiteModelResponse build() {
            return new TfLiteModelResponse(automlModel, gcsTfliteUri, sizeBytes);
        }
    }
}
