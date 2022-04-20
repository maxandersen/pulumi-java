// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.SharingProfileGroupResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Profile for gallery sharing to subscription or tenant
 * 
 */
public final class SharingProfileResponse extends com.pulumi.resources.InvokeArgs {

    public static final SharingProfileResponse Empty = new SharingProfileResponse();

    /**
     * A list of sharing profile groups.
     * 
     */
    @Import(name="groups", required=true)
      private final List<SharingProfileGroupResponse> groups;

    public List<SharingProfileGroupResponse> groups() {
        return this.groups;
    }

    /**
     * This property allows you to specify the permission of sharing gallery. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Private** &lt;br&gt;&lt;br&gt; **Groups**
     * 
     */
    @Import(name="permissions")
      private final @Nullable String permissions;

    public Optional<String> permissions() {
        return this.permissions == null ? Optional.empty() : Optional.ofNullable(this.permissions);
    }

    public SharingProfileResponse(
        List<SharingProfileGroupResponse> groups,
        @Nullable String permissions) {
        this.groups = Objects.requireNonNull(groups, "expected parameter 'groups' to be non-null");
        this.permissions = permissions;
    }

    private SharingProfileResponse() {
        this.groups = List.of();
        this.permissions = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SharingProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<SharingProfileGroupResponse> groups;
        private @Nullable String permissions;

        public Builder() {
    	      // Empty
        }

        public Builder(SharingProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groups = defaults.groups;
    	      this.permissions = defaults.permissions;
        }

        public Builder groups(List<SharingProfileGroupResponse> groups) {
            this.groups = Objects.requireNonNull(groups);
            return this;
        }
        public Builder groups(SharingProfileGroupResponse... groups) {
            return groups(List.of(groups));
        }
        public Builder permissions(@Nullable String permissions) {
            this.permissions = permissions;
            return this;
        }        public SharingProfileResponse build() {
            return new SharingProfileResponse(groups, permissions);
        }
    }
}
