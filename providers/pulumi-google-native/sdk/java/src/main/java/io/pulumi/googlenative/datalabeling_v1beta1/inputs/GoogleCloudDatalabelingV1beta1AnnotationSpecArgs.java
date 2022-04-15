// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Container of information related to one possible annotation that can be used in a labeling task. For example, an image classification task where images are labeled as `dog` or `cat` must reference an AnnotationSpec for `dog` and an AnnotationSpec for `cat`.
 * 
 */
public final class GoogleCloudDatalabelingV1beta1AnnotationSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatalabelingV1beta1AnnotationSpecArgs Empty = new GoogleCloudDatalabelingV1beta1AnnotationSpecArgs();

    /**
     * Optional. User-provided description of the annotation specification. The description can be up to 10,000 characters long.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The display name of the AnnotationSpec. Maximum of 64 characters.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    public GoogleCloudDatalabelingV1beta1AnnotationSpecArgs(
        @Nullable Output<String> description,
        Output<String> displayName) {
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
    }

    private GoogleCloudDatalabelingV1beta1AnnotationSpecArgs() {
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1AnnotationSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> displayName;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatalabelingV1beta1AnnotationSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }        public GoogleCloudDatalabelingV1beta1AnnotationSpecArgs build() {
            return new GoogleCloudDatalabelingV1beta1AnnotationSpecArgs(description, displayName);
        }
    }
}
