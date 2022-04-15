// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.clouddeploy_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.clouddeploy_v1.inputs.SerialPipelineArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeliveryPipelineArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryPipelineArgs Empty = new DeliveryPipelineArgs();

    /**
     * User annotations. These attributes can only be set and used by the user, and not by Google Cloud Deploy. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<Map<String,String>> annotations;

    public Output<Map<String,String>> annotations() {
        return this.annotations == null ? Codegen.empty() : this.annotations;
    }

    @Import(name="deliveryPipelineId", required=true)
      private final Output<String> deliveryPipelineId;

    public Output<String> deliveryPipelineId() {
        return this.deliveryPipelineId;
    }

    /**
     * Description of the `DeliveryPipeline`. Max length is 255 characters.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> etag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    /**
     * Labels are attributes that can be set and used by both the user and by Google Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be <= 128 bytes.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Optional. Name of the `DeliveryPipeline`. Format is projects/{project}/ locations/{location}/deliveryPipelines/a-z{0,62}.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * SerialPipeline defines a sequential set of stages for a `DeliveryPipeline`.
     * 
     */
    @Import(name="serialPipeline")
      private final @Nullable Output<SerialPipelineArgs> serialPipeline;

    public Output<SerialPipelineArgs> serialPipeline() {
        return this.serialPipeline == null ? Codegen.empty() : this.serialPipeline;
    }

    @Import(name="validateOnly")
      private final @Nullable Output<String> validateOnly;

    public Output<String> validateOnly() {
        return this.validateOnly == null ? Codegen.empty() : this.validateOnly;
    }

    public DeliveryPipelineArgs(
        @Nullable Output<Map<String,String>> annotations,
        Output<String> deliveryPipelineId,
        @Nullable Output<String> description,
        @Nullable Output<String> etag,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> requestId,
        @Nullable Output<SerialPipelineArgs> serialPipeline,
        @Nullable Output<String> validateOnly) {
        this.annotations = annotations;
        this.deliveryPipelineId = Objects.requireNonNull(deliveryPipelineId, "expected parameter 'deliveryPipelineId' to be non-null");
        this.description = description;
        this.etag = etag;
        this.labels = labels;
        this.location = location;
        this.name = name;
        this.project = project;
        this.requestId = requestId;
        this.serialPipeline = serialPipeline;
        this.validateOnly = validateOnly;
    }

    private DeliveryPipelineArgs() {
        this.annotations = Codegen.empty();
        this.deliveryPipelineId = Codegen.empty();
        this.description = Codegen.empty();
        this.etag = Codegen.empty();
        this.labels = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.requestId = Codegen.empty();
        this.serialPipeline = Codegen.empty();
        this.validateOnly = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryPipelineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> annotations;
        private Output<String> deliveryPipelineId;
        private @Nullable Output<String> description;
        private @Nullable Output<String> etag;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> requestId;
        private @Nullable Output<SerialPipelineArgs> serialPipeline;
        private @Nullable Output<String> validateOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryPipelineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.deliveryPipelineId = defaults.deliveryPipelineId;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.serialPipeline = defaults.serialPipeline;
    	      this.validateOnly = defaults.validateOnly;
        }

        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(@Nullable Map<String,String> annotations) {
            this.annotations = Codegen.ofNullable(annotations);
            return this;
        }
        public Builder deliveryPipelineId(Output<String> deliveryPipelineId) {
            this.deliveryPipelineId = Objects.requireNonNull(deliveryPipelineId);
            return this;
        }
        public Builder deliveryPipelineId(String deliveryPipelineId) {
            this.deliveryPipelineId = Output.of(Objects.requireNonNull(deliveryPipelineId));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder serialPipeline(@Nullable Output<SerialPipelineArgs> serialPipeline) {
            this.serialPipeline = serialPipeline;
            return this;
        }
        public Builder serialPipeline(@Nullable SerialPipelineArgs serialPipeline) {
            this.serialPipeline = Codegen.ofNullable(serialPipeline);
            return this;
        }
        public Builder validateOnly(@Nullable Output<String> validateOnly) {
            this.validateOnly = validateOnly;
            return this;
        }
        public Builder validateOnly(@Nullable String validateOnly) {
            this.validateOnly = Codegen.ofNullable(validateOnly);
            return this;
        }        public DeliveryPipelineArgs build() {
            return new DeliveryPipelineArgs(annotations, deliveryPipelineId, description, etag, labels, location, name, project, requestId, serialPipeline, validateOnly);
        }
    }
}
