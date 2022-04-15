// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import io.pulumi.azurenative.datafactory.inputs.WebAnonymousAuthenticationArgs;
import io.pulumi.azurenative.datafactory.inputs.WebBasicAuthenticationArgs;
import io.pulumi.azurenative.datafactory.inputs.WebClientCertificateAuthenticationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Web linked service.
 * 
 */
public final class WebLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebLinkedServiceArgs Empty = new WebLinkedServiceArgs();

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<List<Object>> annotations;

    public Output<List<Object>> annotations() {
        return this.annotations == null ? Codegen.empty() : this.annotations;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
      private final @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;

    public Output<IntegrationRuntimeReferenceArgs> connectVia() {
        return this.connectVia == null ? Codegen.empty() : this.connectVia;
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    public Output<Map<String,ParameterSpecificationArgs>> parameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    /**
     * Type of linked service.
     * Expected value is 'Web'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Web linked service properties.
     * 
     */
    @Import(name="typeProperties", required=true)
      private final Output<Object> typeProperties;

    public Output<Object> typeProperties() {
        return this.typeProperties;
    }

    public WebLinkedServiceArgs(
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Output<String> description,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        Output<String> type,
        Output<Object> typeProperties) {
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.description = description;
        this.parameters = parameters;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.typeProperties = Objects.requireNonNull(typeProperties, "expected parameter 'typeProperties' to be non-null");
    }

    private WebLinkedServiceArgs() {
        this.annotations = Codegen.empty();
        this.connectVia = Codegen.empty();
        this.description = Codegen.empty();
        this.parameters = Codegen.empty();
        this.type = Codegen.empty();
        this.typeProperties = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Output<String> description;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private Output<String> type;
        private Output<Object> typeProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(WebLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
    	      this.typeProperties = defaults.typeProperties;
        }

        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = Codegen.ofNullable(annotations);
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder connectVia(@Nullable Output<IntegrationRuntimeReferenceArgs> connectVia) {
            this.connectVia = connectVia;
            return this;
        }
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceArgs connectVia) {
            this.connectVia = Codegen.ofNullable(connectVia);
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
        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder typeProperties(Output<Object> typeProperties) {
            this.typeProperties = Objects.requireNonNull(typeProperties);
            return this;
        }
        public Builder typeProperties(Object typeProperties) {
            this.typeProperties = Output.of(Objects.requireNonNull(typeProperties));
            return this;
        }        public WebLinkedServiceArgs build() {
            return new WebLinkedServiceArgs(annotations, connectVia, description, parameters, type, typeProperties);
        }
    }
}
