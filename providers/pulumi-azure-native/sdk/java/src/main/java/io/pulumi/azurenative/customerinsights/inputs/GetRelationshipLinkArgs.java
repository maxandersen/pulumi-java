// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRelationshipLinkArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRelationshipLinkArgs Empty = new GetRelationshipLinkArgs();

    /**
     * The name of the hub.
     * 
     */
    @Import(name="hubName", required=true)
      private final String hubName;

    public String hubName() {
        return this.hubName;
    }

    /**
     * The name of the relationship link.
     * 
     */
    @Import(name="relationshipLinkName", required=true)
      private final String relationshipLinkName;

    public String relationshipLinkName() {
        return this.relationshipLinkName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public GetRelationshipLinkArgs(
        String hubName,
        String relationshipLinkName,
        String resourceGroupName) {
        this.hubName = Objects.requireNonNull(hubName, "expected parameter 'hubName' to be non-null");
        this.relationshipLinkName = Objects.requireNonNull(relationshipLinkName, "expected parameter 'relationshipLinkName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetRelationshipLinkArgs() {
        this.hubName = null;
        this.relationshipLinkName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRelationshipLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hubName;
        private String relationshipLinkName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRelationshipLinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hubName = defaults.hubName;
    	      this.relationshipLinkName = defaults.relationshipLinkName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder hubName(String hubName) {
            this.hubName = Objects.requireNonNull(hubName);
            return this;
        }
        public Builder relationshipLinkName(String relationshipLinkName) {
            this.relationshipLinkName = Objects.requireNonNull(relationshipLinkName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetRelationshipLinkArgs build() {
            return new GetRelationshipLinkArgs(hubName, relationshipLinkName, resourceGroupName);
        }
    }
}
