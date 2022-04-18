// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dynamics365fraudprotection.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An array of administrator user identities
 * 
 */
public final class DFPInstanceAdministratorsResponse extends com.pulumi.resources.InvokeArgs {

    public static final DFPInstanceAdministratorsResponse Empty = new DFPInstanceAdministratorsResponse();

    /**
     * An array of administrator user identities.
     * 
     */
    @Import(name="members")
      private final @Nullable List<String> members;

    public List<String> members() {
        return this.members == null ? List.of() : this.members;
    }

    public DFPInstanceAdministratorsResponse(@Nullable List<String> members) {
        this.members = members;
    }

    private DFPInstanceAdministratorsResponse() {
        this.members = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DFPInstanceAdministratorsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> members;

        public Builder() {
    	      // Empty
        }

        public Builder(DFPInstanceAdministratorsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.members = defaults.members;
        }

        public Builder members(@Nullable List<String> members) {
            this.members = members;
            return this;
        }
        public Builder members(String... members) {
            return members(List.of(members));
        }        public DFPInstanceAdministratorsResponse build() {
            return new DFPInstanceAdministratorsResponse(members);
        }
    }
}
