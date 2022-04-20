// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customproviders.outputs;

import com.pulumi.azurenative.customproviders.outputs.CustomRPActionRouteDefinitionResponse;
import com.pulumi.azurenative.customproviders.outputs.CustomRPResourceTypeRouteDefinitionResponse;
import com.pulumi.azurenative.customproviders.outputs.CustomRPValidationsResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetCustomResourceProviderResult {
    /**
     * A list of actions that the custom resource provider implements.
     * 
     */
    private final @Nullable List<CustomRPActionRouteDefinitionResponse> actions;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * The provisioning state of the resource provider.
     * 
     */
    private final String provisioningState;
    /**
     * A list of resource types that the custom resource provider implements.
     * 
     */
    private final @Nullable List<CustomRPResourceTypeRouteDefinitionResponse> resourceTypes;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type
     * 
     */
    private final String type;
    /**
     * A list of validations to run on the custom resource provider&#39;s requests.
     * 
     */
    private final @Nullable List<CustomRPValidationsResponse> validations;

    @CustomType.Constructor
    private GetCustomResourceProviderResult(
        @CustomType.Parameter("actions") @Nullable List<CustomRPActionRouteDefinitionResponse> actions,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("resourceTypes") @Nullable List<CustomRPResourceTypeRouteDefinitionResponse> resourceTypes,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("validations") @Nullable List<CustomRPValidationsResponse> validations) {
        this.actions = actions;
        this.id = id;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.resourceTypes = resourceTypes;
        this.tags = tags;
        this.type = type;
        this.validations = validations;
    }

    /**
     * A list of actions that the custom resource provider implements.
     * 
    */
    public List<CustomRPActionRouteDefinitionResponse> actions() {
        return this.actions == null ? List.of() : this.actions;
    }
    /**
     * Resource Id
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Resource location
     * 
    */
    public String location() {
        return this.location;
    }
    /**
     * Resource name
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The provisioning state of the resource provider.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * A list of resource types that the custom resource provider implements.
     * 
    */
    public List<CustomRPResourceTypeRouteDefinitionResponse> resourceTypes() {
        return this.resourceTypes == null ? List.of() : this.resourceTypes;
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * A list of validations to run on the custom resource provider&#39;s requests.
     * 
    */
    public List<CustomRPValidationsResponse> validations() {
        return this.validations == null ? List.of() : this.validations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCustomResourceProviderResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<CustomRPActionRouteDefinitionResponse> actions;
        private String id;
        private String location;
        private String name;
        private String provisioningState;
        private @Nullable List<CustomRPResourceTypeRouteDefinitionResponse> resourceTypes;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable List<CustomRPValidationsResponse> validations;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCustomResourceProviderResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceTypes = defaults.resourceTypes;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.validations = defaults.validations;
        }

        public Builder actions(@Nullable List<CustomRPActionRouteDefinitionResponse> actions) {
            this.actions = actions;
            return this;
        }
        public Builder actions(CustomRPActionRouteDefinitionResponse... actions) {
            return actions(List.of(actions));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder resourceTypes(@Nullable List<CustomRPResourceTypeRouteDefinitionResponse> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }
        public Builder resourceTypes(CustomRPResourceTypeRouteDefinitionResponse... resourceTypes) {
            return resourceTypes(List.of(resourceTypes));
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder validations(@Nullable List<CustomRPValidationsResponse> validations) {
            this.validations = validations;
            return this;
        }
        public Builder validations(CustomRPValidationsResponse... validations) {
            return validations(List.of(validations));
        }        public GetCustomResourceProviderResult build() {
            return new GetCustomResourceProviderResult(actions, id, location, name, provisioningState, resourceTypes, tags, type, validations);
        }
    }
}
