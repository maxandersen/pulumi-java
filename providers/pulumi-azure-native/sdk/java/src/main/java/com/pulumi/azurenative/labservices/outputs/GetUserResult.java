// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.labservices.outputs;

import com.pulumi.azurenative.labservices.outputs.LatestOperationResultResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetUserResult {
    /**
     * @return The user email address, as it was specified during registration.
     * 
     */
    private final String email;
    /**
     * @return The user family name, as it was specified during registration.
     * 
     */
    private final String familyName;
    /**
     * @return The user given name, as it was specified during registration.
     * 
     */
    private final String givenName;
    /**
     * @return The identifier of the resource.
     * 
     */
    private final String id;
    /**
     * @return The details of the latest operation. ex: status, error
     * 
     */
    private final LatestOperationResultResponse latestOperationResult;
    /**
     * @return The location of the resource.
     * 
     */
    private final @Nullable String location;
    /**
     * @return The name of the resource.
     * 
     */
    private final String name;
    /**
     * @return The provisioning status of the resource.
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * @return The tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return The user tenant ID, as it was specified during registration.
     * 
     */
    private final String tenantId;
    /**
     * @return How long the user has used his VMs in this lab
     * 
     */
    private final String totalUsage;
    /**
     * @return The type of the resource.
     * 
     */
    private final String type;
    /**
     * @return The unique immutable identifier of a resource (Guid).
     * 
     */
    private final @Nullable String uniqueIdentifier;

    @CustomType.Constructor
    private GetUserResult(
        @CustomType.Parameter("email") String email,
        @CustomType.Parameter("familyName") String familyName,
        @CustomType.Parameter("givenName") String givenName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("latestOperationResult") LatestOperationResultResponse latestOperationResult,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") @Nullable String provisioningState,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("tenantId") String tenantId,
        @CustomType.Parameter("totalUsage") String totalUsage,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("uniqueIdentifier") @Nullable String uniqueIdentifier) {
        this.email = email;
        this.familyName = familyName;
        this.givenName = givenName;
        this.id = id;
        this.latestOperationResult = latestOperationResult;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.tags = tags;
        this.tenantId = tenantId;
        this.totalUsage = totalUsage;
        this.type = type;
        this.uniqueIdentifier = uniqueIdentifier;
    }

    /**
     * @return The user email address, as it was specified during registration.
     * 
     */
    public String email() {
        return this.email;
    }
    /**
     * @return The user family name, as it was specified during registration.
     * 
     */
    public String familyName() {
        return this.familyName;
    }
    /**
     * @return The user given name, as it was specified during registration.
     * 
     */
    public String givenName() {
        return this.givenName;
    }
    /**
     * @return The identifier of the resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The details of the latest operation. ex: status, error
     * 
     */
    public LatestOperationResultResponse latestOperationResult() {
        return this.latestOperationResult;
    }
    /**
     * @return The location of the resource.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return The name of the resource.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The provisioning status of the resource.
     * 
     */
    public Optional<String> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * @return The tags of the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The user tenant ID, as it was specified during registration.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }
    /**
     * @return How long the user has used his VMs in this lab
     * 
     */
    public String totalUsage() {
        return this.totalUsage;
    }
    /**
     * @return The type of the resource.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The unique immutable identifier of a resource (Guid).
     * 
     */
    public Optional<String> uniqueIdentifier() {
        return Optional.ofNullable(this.uniqueIdentifier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String email;
        private String familyName;
        private String givenName;
        private String id;
        private LatestOperationResultResponse latestOperationResult;
        private @Nullable String location;
        private String name;
        private @Nullable String provisioningState;
        private @Nullable Map<String,String> tags;
        private String tenantId;
        private String totalUsage;
        private String type;
        private @Nullable String uniqueIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.familyName = defaults.familyName;
    	      this.givenName = defaults.givenName;
    	      this.id = defaults.id;
    	      this.latestOperationResult = defaults.latestOperationResult;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.tags = defaults.tags;
    	      this.tenantId = defaults.tenantId;
    	      this.totalUsage = defaults.totalUsage;
    	      this.type = defaults.type;
    	      this.uniqueIdentifier = defaults.uniqueIdentifier;
        }

        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        public Builder familyName(String familyName) {
            this.familyName = Objects.requireNonNull(familyName);
            return this;
        }
        public Builder givenName(String givenName) {
            this.givenName = Objects.requireNonNull(givenName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder latestOperationResult(LatestOperationResultResponse latestOperationResult) {
            this.latestOperationResult = Objects.requireNonNull(latestOperationResult);
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
        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public Builder totalUsage(String totalUsage) {
            this.totalUsage = Objects.requireNonNull(totalUsage);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder uniqueIdentifier(@Nullable String uniqueIdentifier) {
            this.uniqueIdentifier = uniqueIdentifier;
            return this;
        }        public GetUserResult build() {
            return new GetUserResult(email, familyName, givenName, id, latestOperationResult, location, name, provisioningState, tags, tenantId, totalUsage, type, uniqueIdentifier);
        }
    }
}
