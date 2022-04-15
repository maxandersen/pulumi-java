// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.inputs.WebAnonymousAuthenticationResponse;
import io.pulumi.azurenative.datafactory.inputs.WebBasicAuthenticationResponse;
import io.pulumi.azurenative.datafactory.inputs.WebClientCertificateAuthenticationResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Web linked service.
 * 
 */
public final class WebLinkedServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final WebLinkedServiceResponse Empty = new WebLinkedServiceResponse();

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
      private final @Nullable List<Object> annotations;

    public List<Object> annotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
      private final @Nullable IntegrationRuntimeReferenceResponse connectVia;

    public Optional<IntegrationRuntimeReferenceResponse> connectVia() {
        return this.connectVia == null ? Optional.empty() : Optional.ofNullable(this.connectVia);
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Map<String,ParameterSpecificationResponse> parameters;

    public Map<String,ParameterSpecificationResponse> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    /**
     * Type of linked service.
     * Expected value is 'Web'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * Web linked service properties.
     * 
     */
    @Import(name="typeProperties", required=true)
      private final Object typeProperties;

    public Object typeProperties() {
        return this.typeProperties;
    }

    public WebLinkedServiceResponse(
        @Nullable List<Object> annotations,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable String description,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        String type,
        Object typeProperties) {
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.description = description;
        this.parameters = parameters;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.typeProperties = Objects.requireNonNull(typeProperties, "expected parameter 'typeProperties' to be non-null");
    }

    private WebLinkedServiceResponse() {
        this.annotations = List.of();
        this.connectVia = null;
        this.description = null;
        this.parameters = Map.of();
        this.type = null;
        this.typeProperties = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private String type;
        private Object typeProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(WebLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
    	      this.typeProperties = defaults.typeProperties;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder typeProperties(Object typeProperties) {
            this.typeProperties = Objects.requireNonNull(typeProperties);
            return this;
        }        public WebLinkedServiceResponse build() {
            return new WebLinkedServiceResponse(annotations, connectVia, description, parameters, type, typeProperties);
        }
    }
}
