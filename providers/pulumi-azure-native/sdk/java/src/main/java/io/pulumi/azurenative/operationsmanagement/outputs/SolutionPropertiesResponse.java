// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationsmanagement.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class SolutionPropertiesResponse {
    /**
     * The azure resources that will be contained within the solutions. They will be locked and gets deleted automatically when the solution is deleted.
     * 
     */
    private final @Nullable List<String> containedResources;
    /**
     * The provisioning state for the solution.
     * 
     */
    private final String provisioningState;
    /**
     * The resources that will be referenced from this solution. Deleting any of those solution out of band will break the solution.
     * 
     */
    private final @Nullable List<String> referencedResources;
    /**
     * The azure resourceId for the workspace where the solution will be deployed/enabled.
     * 
     */
    private final String workspaceResourceId;

    @CustomType.Constructor
    private SolutionPropertiesResponse(
        @CustomType.Parameter("containedResources") @Nullable List<String> containedResources,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("referencedResources") @Nullable List<String> referencedResources,
        @CustomType.Parameter("workspaceResourceId") String workspaceResourceId) {
        this.containedResources = containedResources;
        this.provisioningState = provisioningState;
        this.referencedResources = referencedResources;
        this.workspaceResourceId = workspaceResourceId;
    }

    /**
     * The azure resources that will be contained within the solutions. They will be locked and gets deleted automatically when the solution is deleted.
     * 
    */
    public List<String> containedResources() {
        return this.containedResources == null ? List.of() : this.containedResources;
    }
    /**
     * The provisioning state for the solution.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * The resources that will be referenced from this solution. Deleting any of those solution out of band will break the solution.
     * 
    */
    public List<String> referencedResources() {
        return this.referencedResources == null ? List.of() : this.referencedResources;
    }
    /**
     * The azure resourceId for the workspace where the solution will be deployed/enabled.
     * 
    */
    public String workspaceResourceId() {
        return this.workspaceResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SolutionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> containedResources;
        private String provisioningState;
        private @Nullable List<String> referencedResources;
        private String workspaceResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(SolutionPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containedResources = defaults.containedResources;
    	      this.provisioningState = defaults.provisioningState;
    	      this.referencedResources = defaults.referencedResources;
    	      this.workspaceResourceId = defaults.workspaceResourceId;
        }

        public Builder containedResources(@Nullable List<String> containedResources) {
            this.containedResources = containedResources;
            return this;
        }
        public Builder containedResources(String... containedResources) {
            return containedResources(List.of(containedResources));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder referencedResources(@Nullable List<String> referencedResources) {
            this.referencedResources = referencedResources;
            return this;
        }
        public Builder referencedResources(String... referencedResources) {
            return referencedResources(List.of(referencedResources));
        }
        public Builder workspaceResourceId(String workspaceResourceId) {
            this.workspaceResourceId = Objects.requireNonNull(workspaceResourceId);
            return this;
        }        public SolutionPropertiesResponse build() {
            return new SolutionPropertiesResponse(containedResources, provisioningState, referencedResources, workspaceResourceId);
        }
    }
}
