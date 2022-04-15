// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetApplicationTypeVersionResult {
    /**
     * The URL to the application package
     * 
     */
    private final String appPackageUrl;
    /**
     * List of application type parameters that can be overridden when creating or updating the application.
     * 
     */
    private final Map<String,String> defaultParameterList;
    /**
     * Azure resource etag.
     * 
     */
    private final String etag;
    /**
     * Azure resource identifier.
     * 
     */
    private final String id;
    /**
     * It will be deprecated in New API, resource location depends on the parent resource.
     * 
     */
    private final @Nullable String location;
    /**
     * Azure resource name.
     * 
     */
    private final String name;
    /**
     * The current deployment or provisioning state, which only appears in the response
     * 
     */
    private final String provisioningState;
    /**
     * Azure resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Azure resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetApplicationTypeVersionResult(
        @CustomType.Parameter("appPackageUrl") String appPackageUrl,
        @CustomType.Parameter("defaultParameterList") Map<String,String> defaultParameterList,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.appPackageUrl = appPackageUrl;
        this.defaultParameterList = defaultParameterList;
        this.etag = etag;
        this.id = id;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.tags = tags;
        this.type = type;
    }

    /**
     * The URL to the application package
     * 
    */
    public String appPackageUrl() {
        return this.appPackageUrl;
    }
    /**
     * List of application type parameters that can be overridden when creating or updating the application.
     * 
    */
    public Map<String,String> defaultParameterList() {
        return this.defaultParameterList;
    }
    /**
     * Azure resource etag.
     * 
    */
    public String etag() {
        return this.etag;
    }
    /**
     * Azure resource identifier.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * It will be deprecated in New API, resource location depends on the parent resource.
     * 
    */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Azure resource name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The current deployment or provisioning state, which only appears in the response
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * Azure resource tags.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Azure resource type.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationTypeVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appPackageUrl;
        private Map<String,String> defaultParameterList;
        private String etag;
        private String id;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationTypeVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appPackageUrl = defaults.appPackageUrl;
    	      this.defaultParameterList = defaults.defaultParameterList;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder appPackageUrl(String appPackageUrl) {
            this.appPackageUrl = Objects.requireNonNull(appPackageUrl);
            return this;
        }
        public Builder defaultParameterList(Map<String,String> defaultParameterList) {
            this.defaultParameterList = Objects.requireNonNull(defaultParameterList);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
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
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetApplicationTypeVersionResult build() {
            return new GetApplicationTypeVersionResult(appPackageUrl, defaultParameterList, etag, id, location, name, provisioningState, tags, type);
        }
    }
}
