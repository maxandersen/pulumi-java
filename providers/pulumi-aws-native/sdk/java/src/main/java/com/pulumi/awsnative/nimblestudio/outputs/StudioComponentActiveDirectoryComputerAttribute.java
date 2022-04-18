// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.nimblestudio.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StudioComponentActiveDirectoryComputerAttribute {
    /**
     * <p>The name for the LDAP attribute.</p>
     * 
     */
    private final @Nullable String name;
    /**
     * <p>The value for the LDAP attribute.</p>
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private StudioComponentActiveDirectoryComputerAttribute(
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("value") @Nullable String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * <p>The name for the LDAP attribute.</p>
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * <p>The value for the LDAP attribute.</p>
     * 
    */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioComponentActiveDirectoryComputerAttribute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioComponentActiveDirectoryComputerAttribute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public StudioComponentActiveDirectoryComputerAttribute build() {
            return new StudioComponentActiveDirectoryComputerAttribute(name, value);
        }
    }
}
