// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a sub PublicDelegatedPrefix.
 * 
 */
public final class PublicDelegatedPrefixPublicDelegatedSubPrefixArgs extends com.pulumi.resources.ResourceArgs {

    public static final PublicDelegatedPrefixPublicDelegatedSubPrefixArgs Empty = new PublicDelegatedPrefixPublicDelegatedSubPrefixArgs();

    /**
     * Name of the project scoping this PublicDelegatedSubPrefix.
     * 
     */
    @Import(name="delegateeProject")
      private final @Nullable Output<String> delegateeProject;

    public Output<String> delegateeProject() {
        return this.delegateeProject == null ? Codegen.empty() : this.delegateeProject;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The IPv4 address range, in CIDR format, represented by this sub public delegated prefix.
     * 
     */
    @Import(name="ipCidrRange")
      private final @Nullable Output<String> ipCidrRange;

    public Output<String> ipCidrRange() {
        return this.ipCidrRange == null ? Codegen.empty() : this.ipCidrRange;
    }

    /**
     * Whether the sub prefix is delegated to create Address resources in the delegatee project.
     * 
     */
    @Import(name="isAddress")
      private final @Nullable Output<Boolean> isAddress;

    public Output<Boolean> isAddress() {
        return this.isAddress == null ? Codegen.empty() : this.isAddress;
    }

    /**
     * The name of the sub public delegated prefix.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public PublicDelegatedPrefixPublicDelegatedSubPrefixArgs(
        @Nullable Output<String> delegateeProject,
        @Nullable Output<String> description,
        @Nullable Output<String> ipCidrRange,
        @Nullable Output<Boolean> isAddress,
        @Nullable Output<String> name) {
        this.delegateeProject = delegateeProject;
        this.description = description;
        this.ipCidrRange = ipCidrRange;
        this.isAddress = isAddress;
        this.name = name;
    }

    private PublicDelegatedPrefixPublicDelegatedSubPrefixArgs() {
        this.delegateeProject = Codegen.empty();
        this.description = Codegen.empty();
        this.ipCidrRange = Codegen.empty();
        this.isAddress = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicDelegatedPrefixPublicDelegatedSubPrefixArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> delegateeProject;
        private @Nullable Output<String> description;
        private @Nullable Output<String> ipCidrRange;
        private @Nullable Output<Boolean> isAddress;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicDelegatedPrefixPublicDelegatedSubPrefixArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delegateeProject = defaults.delegateeProject;
    	      this.description = defaults.description;
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.isAddress = defaults.isAddress;
    	      this.name = defaults.name;
        }

        public Builder delegateeProject(@Nullable Output<String> delegateeProject) {
            this.delegateeProject = delegateeProject;
            return this;
        }
        public Builder delegateeProject(@Nullable String delegateeProject) {
            this.delegateeProject = Codegen.ofNullable(delegateeProject);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder ipCidrRange(@Nullable Output<String> ipCidrRange) {
            this.ipCidrRange = ipCidrRange;
            return this;
        }
        public Builder ipCidrRange(@Nullable String ipCidrRange) {
            this.ipCidrRange = Codegen.ofNullable(ipCidrRange);
            return this;
        }
        public Builder isAddress(@Nullable Output<Boolean> isAddress) {
            this.isAddress = isAddress;
            return this;
        }
        public Builder isAddress(@Nullable Boolean isAddress) {
            this.isAddress = Codegen.ofNullable(isAddress);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public PublicDelegatedPrefixPublicDelegatedSubPrefixArgs build() {
            return new PublicDelegatedPrefixPublicDelegatedSubPrefixArgs(delegateeProject, description, ipCidrRange, isAddress, name);
        }
    }
}
