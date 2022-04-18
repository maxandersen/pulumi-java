// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.azurenative.insights.inputs.MyWorkbookUserAssignedIdentitiesResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Customer Managed Identity
 * 
 */
public final class MyWorkbookManagedIdentityResponse extends com.pulumi.resources.InvokeArgs {

    public static final MyWorkbookManagedIdentityResponse Empty = new MyWorkbookManagedIdentityResponse();

    /**
     * The identity type.
     * 
     */
    @Import(name="type")
      private final @Nullable String type;

    public Optional<String> type() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    /**
     * Customer Managed Identity
     * 
     */
    @Import(name="userAssignedIdentities")
      private final @Nullable MyWorkbookUserAssignedIdentitiesResponse userAssignedIdentities;

    public Optional<MyWorkbookUserAssignedIdentitiesResponse> userAssignedIdentities() {
        return this.userAssignedIdentities == null ? Optional.empty() : Optional.ofNullable(this.userAssignedIdentities);
    }

    public MyWorkbookManagedIdentityResponse(
        @Nullable String type,
        @Nullable MyWorkbookUserAssignedIdentitiesResponse userAssignedIdentities) {
        this.type = type;
        this.userAssignedIdentities = userAssignedIdentities;
    }

    private MyWorkbookManagedIdentityResponse() {
        this.type = null;
        this.userAssignedIdentities = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MyWorkbookManagedIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String type;
        private @Nullable MyWorkbookUserAssignedIdentitiesResponse userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(MyWorkbookManagedIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder userAssignedIdentities(@Nullable MyWorkbookUserAssignedIdentitiesResponse userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }        public MyWorkbookManagedIdentityResponse build() {
            return new MyWorkbookManagedIdentityResponse(type, userAssignedIdentities);
        }
    }
}
