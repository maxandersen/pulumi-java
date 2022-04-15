// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Config for setting up sentiments.
 * 
 */
public final class GoogleCloudDatalabelingV1beta1SentimentConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatalabelingV1beta1SentimentConfigArgs Empty = new GoogleCloudDatalabelingV1beta1SentimentConfigArgs();

    /**
     * If set to true, contributors will have the option to select sentiment of the label they selected, to mark it as negative or positive label. Default is false.
     * 
     */
    @Import(name="enableLabelSentimentSelection")
      private final @Nullable Output<Boolean> enableLabelSentimentSelection;

    public Output<Boolean> enableLabelSentimentSelection() {
        return this.enableLabelSentimentSelection == null ? Codegen.empty() : this.enableLabelSentimentSelection;
    }

    public GoogleCloudDatalabelingV1beta1SentimentConfigArgs(@Nullable Output<Boolean> enableLabelSentimentSelection) {
        this.enableLabelSentimentSelection = enableLabelSentimentSelection;
    }

    private GoogleCloudDatalabelingV1beta1SentimentConfigArgs() {
        this.enableLabelSentimentSelection = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1SentimentConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableLabelSentimentSelection;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatalabelingV1beta1SentimentConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableLabelSentimentSelection = defaults.enableLabelSentimentSelection;
        }

        public Builder enableLabelSentimentSelection(@Nullable Output<Boolean> enableLabelSentimentSelection) {
            this.enableLabelSentimentSelection = enableLabelSentimentSelection;
            return this;
        }
        public Builder enableLabelSentimentSelection(@Nullable Boolean enableLabelSentimentSelection) {
            this.enableLabelSentimentSelection = Codegen.ofNullable(enableLabelSentimentSelection);
            return this;
        }        public GoogleCloudDatalabelingV1beta1SentimentConfigArgs build() {
            return new GoogleCloudDatalabelingV1beta1SentimentConfigArgs(enableLabelSentimentSelection);
        }
    }
}
