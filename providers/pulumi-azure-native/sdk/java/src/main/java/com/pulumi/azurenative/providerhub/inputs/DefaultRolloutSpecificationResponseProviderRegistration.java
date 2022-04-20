// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.inputs;

import com.pulumi.azurenative.providerhub.inputs.ProviderRegistrationResponseProperties;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DefaultRolloutSpecificationResponseProviderRegistration extends com.pulumi.resources.InvokeArgs {

    public static final DefaultRolloutSpecificationResponseProviderRegistration Empty = new DefaultRolloutSpecificationResponseProviderRegistration();

    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String id() {
        return this.id;
    }

    /**
     * The name of the resource
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    @Import(name="properties")
      private final @Nullable ProviderRegistrationResponseProperties properties;

    public Optional<ProviderRegistrationResponseProperties> properties() {
        return this.properties == null ? Optional.empty() : Optional.ofNullable(this.properties);
    }

    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public DefaultRolloutSpecificationResponseProviderRegistration(
        String id,
        String name,
        @Nullable ProviderRegistrationResponseProperties properties,
        String type) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.properties = properties;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DefaultRolloutSpecificationResponseProviderRegistration() {
        this.id = null;
        this.name = null;
        this.properties = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultRolloutSpecificationResponseProviderRegistration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private @Nullable ProviderRegistrationResponseProperties properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultRolloutSpecificationResponseProviderRegistration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder properties(@Nullable ProviderRegistrationResponseProperties properties) {
            this.properties = properties;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public DefaultRolloutSpecificationResponseProviderRegistration build() {
            return new DefaultRolloutSpecificationResponseProviderRegistration(id, name, properties, type);
        }
    }
}
