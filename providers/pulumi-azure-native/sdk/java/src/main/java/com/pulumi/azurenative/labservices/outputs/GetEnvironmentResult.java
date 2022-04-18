// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.labservices.outputs;

import com.pulumi.azurenative.labservices.outputs.LatestOperationResultResponse;
import com.pulumi.azurenative.labservices.outputs.NetworkInterfaceResponse;
import com.pulumi.azurenative.labservices.outputs.ResourceSetResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEnvironmentResult {
    /**
     * The name or email address of the user who has claimed the environment
     * 
     */
    private final String claimedByUserName;
    /**
     * The AAD object Id of the user who has claimed the environment
     * 
     */
    private final String claimedByUserObjectId;
    /**
     * The user principal Id of the user who has claimed the environment
     * 
     */
    private final String claimedByUserPrincipalId;
    /**
     * The identifier of the resource.
     * 
     */
    private final String id;
    /**
     * Is the environment claimed or not
     * 
     */
    private final Boolean isClaimed;
    /**
     * Last known power state of the environment
     * 
     */
    private final String lastKnownPowerState;
    /**
     * The details of the latest operation. ex: status, error
     * 
     */
    private final LatestOperationResultResponse latestOperationResult;
    /**
     * The location of the resource.
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * Network details of the environment
     * 
     */
    private final NetworkInterfaceResponse networkInterface;
    /**
     * When the password was last reset on the environment.
     * 
     */
    private final String passwordLastReset;
    /**
     * The provisioning status of the resource.
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * The set of a VM and the setting id it was created for
     * 
     */
    private final @Nullable ResourceSetResponse resourceSets;
    /**
     * The tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * How long the environment has been used by a lab user
     * 
     */
    private final String totalUsage;
    /**
     * The type of the resource.
     * 
     */
    private final String type;
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    private final @Nullable String uniqueIdentifier;

    @CustomType.Constructor
    private GetEnvironmentResult(
        @CustomType.Parameter("claimedByUserName") String claimedByUserName,
        @CustomType.Parameter("claimedByUserObjectId") String claimedByUserObjectId,
        @CustomType.Parameter("claimedByUserPrincipalId") String claimedByUserPrincipalId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isClaimed") Boolean isClaimed,
        @CustomType.Parameter("lastKnownPowerState") String lastKnownPowerState,
        @CustomType.Parameter("latestOperationResult") LatestOperationResultResponse latestOperationResult,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("networkInterface") NetworkInterfaceResponse networkInterface,
        @CustomType.Parameter("passwordLastReset") String passwordLastReset,
        @CustomType.Parameter("provisioningState") @Nullable String provisioningState,
        @CustomType.Parameter("resourceSets") @Nullable ResourceSetResponse resourceSets,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("totalUsage") String totalUsage,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("uniqueIdentifier") @Nullable String uniqueIdentifier) {
        this.claimedByUserName = claimedByUserName;
        this.claimedByUserObjectId = claimedByUserObjectId;
        this.claimedByUserPrincipalId = claimedByUserPrincipalId;
        this.id = id;
        this.isClaimed = isClaimed;
        this.lastKnownPowerState = lastKnownPowerState;
        this.latestOperationResult = latestOperationResult;
        this.location = location;
        this.name = name;
        this.networkInterface = networkInterface;
        this.passwordLastReset = passwordLastReset;
        this.provisioningState = provisioningState;
        this.resourceSets = resourceSets;
        this.tags = tags;
        this.totalUsage = totalUsage;
        this.type = type;
        this.uniqueIdentifier = uniqueIdentifier;
    }

    /**
     * The name or email address of the user who has claimed the environment
     * 
    */
    public String claimedByUserName() {
        return this.claimedByUserName;
    }
    /**
     * The AAD object Id of the user who has claimed the environment
     * 
    */
    public String claimedByUserObjectId() {
        return this.claimedByUserObjectId;
    }
    /**
     * The user principal Id of the user who has claimed the environment
     * 
    */
    public String claimedByUserPrincipalId() {
        return this.claimedByUserPrincipalId;
    }
    /**
     * The identifier of the resource.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Is the environment claimed or not
     * 
    */
    public Boolean isClaimed() {
        return this.isClaimed;
    }
    /**
     * Last known power state of the environment
     * 
    */
    public String lastKnownPowerState() {
        return this.lastKnownPowerState;
    }
    /**
     * The details of the latest operation. ex: status, error
     * 
    */
    public LatestOperationResultResponse latestOperationResult() {
        return this.latestOperationResult;
    }
    /**
     * The location of the resource.
     * 
    */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The name of the resource.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Network details of the environment
     * 
    */
    public NetworkInterfaceResponse networkInterface() {
        return this.networkInterface;
    }
    /**
     * When the password was last reset on the environment.
     * 
    */
    public String passwordLastReset() {
        return this.passwordLastReset;
    }
    /**
     * The provisioning status of the resource.
     * 
    */
    public Optional<String> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * The set of a VM and the setting id it was created for
     * 
    */
    public Optional<ResourceSetResponse> resourceSets() {
        return Optional.ofNullable(this.resourceSets);
    }
    /**
     * The tags of the resource.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * How long the environment has been used by a lab user
     * 
    */
    public String totalUsage() {
        return this.totalUsage;
    }
    /**
     * The type of the resource.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
    */
    public Optional<String> uniqueIdentifier() {
        return Optional.ofNullable(this.uniqueIdentifier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String claimedByUserName;
        private String claimedByUserObjectId;
        private String claimedByUserPrincipalId;
        private String id;
        private Boolean isClaimed;
        private String lastKnownPowerState;
        private LatestOperationResultResponse latestOperationResult;
        private @Nullable String location;
        private String name;
        private NetworkInterfaceResponse networkInterface;
        private String passwordLastReset;
        private @Nullable String provisioningState;
        private @Nullable ResourceSetResponse resourceSets;
        private @Nullable Map<String,String> tags;
        private String totalUsage;
        private String type;
        private @Nullable String uniqueIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.claimedByUserName = defaults.claimedByUserName;
    	      this.claimedByUserObjectId = defaults.claimedByUserObjectId;
    	      this.claimedByUserPrincipalId = defaults.claimedByUserPrincipalId;
    	      this.id = defaults.id;
    	      this.isClaimed = defaults.isClaimed;
    	      this.lastKnownPowerState = defaults.lastKnownPowerState;
    	      this.latestOperationResult = defaults.latestOperationResult;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.networkInterface = defaults.networkInterface;
    	      this.passwordLastReset = defaults.passwordLastReset;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceSets = defaults.resourceSets;
    	      this.tags = defaults.tags;
    	      this.totalUsage = defaults.totalUsage;
    	      this.type = defaults.type;
    	      this.uniqueIdentifier = defaults.uniqueIdentifier;
        }

        public Builder claimedByUserName(String claimedByUserName) {
            this.claimedByUserName = Objects.requireNonNull(claimedByUserName);
            return this;
        }
        public Builder claimedByUserObjectId(String claimedByUserObjectId) {
            this.claimedByUserObjectId = Objects.requireNonNull(claimedByUserObjectId);
            return this;
        }
        public Builder claimedByUserPrincipalId(String claimedByUserPrincipalId) {
            this.claimedByUserPrincipalId = Objects.requireNonNull(claimedByUserPrincipalId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isClaimed(Boolean isClaimed) {
            this.isClaimed = Objects.requireNonNull(isClaimed);
            return this;
        }
        public Builder lastKnownPowerState(String lastKnownPowerState) {
            this.lastKnownPowerState = Objects.requireNonNull(lastKnownPowerState);
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
        public Builder networkInterface(NetworkInterfaceResponse networkInterface) {
            this.networkInterface = Objects.requireNonNull(networkInterface);
            return this;
        }
        public Builder passwordLastReset(String passwordLastReset) {
            this.passwordLastReset = Objects.requireNonNull(passwordLastReset);
            return this;
        }
        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder resourceSets(@Nullable ResourceSetResponse resourceSets) {
            this.resourceSets = resourceSets;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
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
        }        public GetEnvironmentResult build() {
            return new GetEnvironmentResult(claimedByUserName, claimedByUserObjectId, claimedByUserPrincipalId, id, isClaimed, lastKnownPowerState, latestOperationResult, location, name, networkInterface, passwordLastReset, provisioningState, resourceSets, tags, totalUsage, type, uniqueIdentifier);
        }
    }
}
