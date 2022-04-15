// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.management.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The ID of the parent management group.
 * 
 */
public final class DescendantParentGroupInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final DescendantParentGroupInfoResponse Empty = new DescendantParentGroupInfoResponse();

    /**
     * The fully qualified ID for the parent management group.  For example, /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    public DescendantParentGroupInfoResponse(@Nullable String id) {
        this.id = id;
    }

    private DescendantParentGroupInfoResponse() {
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DescendantParentGroupInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(DescendantParentGroupInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }        public DescendantParentGroupInfoResponse build() {
            return new DescendantParentGroupInfoResponse(id);
        }
    }
}
