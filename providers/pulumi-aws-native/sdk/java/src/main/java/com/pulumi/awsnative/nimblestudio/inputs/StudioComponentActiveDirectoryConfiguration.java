// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.nimblestudio.inputs;

import com.pulumi.awsnative.nimblestudio.inputs.StudioComponentActiveDirectoryComputerAttribute;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * &lt;p&gt;The configuration for a Microsoft Active Directory (Microsoft AD) studio resource.&lt;/p&gt;
 * 
 */
public final class StudioComponentActiveDirectoryConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final StudioComponentActiveDirectoryConfiguration Empty = new StudioComponentActiveDirectoryConfiguration();

    /**
     * &lt;p&gt;A collection of custom attributes for an Active Directory computer.&lt;/p&gt;
     * 
     */
    @Import(name="computerAttributes")
      private final @Nullable List<StudioComponentActiveDirectoryComputerAttribute> computerAttributes;

    public List<StudioComponentActiveDirectoryComputerAttribute> computerAttributes() {
        return this.computerAttributes == null ? List.of() : this.computerAttributes;
    }

    /**
     * &lt;p&gt;The directory ID of the Directory Service for Microsoft Active Directory to access using this studio component.&lt;/p&gt;
     * 
     */
    @Import(name="directoryId")
      private final @Nullable String directoryId;

    public Optional<String> directoryId() {
        return this.directoryId == null ? Optional.empty() : Optional.ofNullable(this.directoryId);
    }

    /**
     * &lt;p&gt;The distinguished name (DN) and organizational unit (OU) of an Active Directory computer.&lt;/p&gt;
     * 
     */
    @Import(name="organizationalUnitDistinguishedName")
      private final @Nullable String organizationalUnitDistinguishedName;

    public Optional<String> organizationalUnitDistinguishedName() {
        return this.organizationalUnitDistinguishedName == null ? Optional.empty() : Optional.ofNullable(this.organizationalUnitDistinguishedName);
    }

    public StudioComponentActiveDirectoryConfiguration(
        @Nullable List<StudioComponentActiveDirectoryComputerAttribute> computerAttributes,
        @Nullable String directoryId,
        @Nullable String organizationalUnitDistinguishedName) {
        this.computerAttributes = computerAttributes;
        this.directoryId = directoryId;
        this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
    }

    private StudioComponentActiveDirectoryConfiguration() {
        this.computerAttributes = List.of();
        this.directoryId = null;
        this.organizationalUnitDistinguishedName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioComponentActiveDirectoryConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<StudioComponentActiveDirectoryComputerAttribute> computerAttributes;
        private @Nullable String directoryId;
        private @Nullable String organizationalUnitDistinguishedName;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioComponentActiveDirectoryConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computerAttributes = defaults.computerAttributes;
    	      this.directoryId = defaults.directoryId;
    	      this.organizationalUnitDistinguishedName = defaults.organizationalUnitDistinguishedName;
        }

        public Builder computerAttributes(@Nullable List<StudioComponentActiveDirectoryComputerAttribute> computerAttributes) {
            this.computerAttributes = computerAttributes;
            return this;
        }
        public Builder computerAttributes(StudioComponentActiveDirectoryComputerAttribute... computerAttributes) {
            return computerAttributes(List.of(computerAttributes));
        }
        public Builder directoryId(@Nullable String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public Builder organizationalUnitDistinguishedName(@Nullable String organizationalUnitDistinguishedName) {
            this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
            return this;
        }        public StudioComponentActiveDirectoryConfiguration build() {
            return new StudioComponentActiveDirectoryConfiguration(computerAttributes, directoryId, organizationalUnitDistinguishedName);
        }
    }
}
