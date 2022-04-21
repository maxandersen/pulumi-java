// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.nimblestudio.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * &lt;p&gt;An LDAP attribute of an Active Directory computer account, in the form of a name:value pair.&lt;/p&gt;
 * 
 */
public final class StudioComponentActiveDirectoryComputerAttribute extends com.pulumi.resources.InvokeArgs {

    public static final StudioComponentActiveDirectoryComputerAttribute Empty = new StudioComponentActiveDirectoryComputerAttribute();

    /**
     * &lt;p&gt;The name for the LDAP attribute.&lt;/p&gt;
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * &lt;p&gt;The value for the LDAP attribute.&lt;/p&gt;
     * 
     */
    @Import(name="value")
    private @Nullable String value;

    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    private StudioComponentActiveDirectoryComputerAttribute() {}

    private StudioComponentActiveDirectoryComputerAttribute(StudioComponentActiveDirectoryComputerAttribute $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StudioComponentActiveDirectoryComputerAttribute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StudioComponentActiveDirectoryComputerAttribute $;

        public Builder() {
            $ = new StudioComponentActiveDirectoryComputerAttribute();
        }

        public Builder(StudioComponentActiveDirectoryComputerAttribute defaults) {
            $ = new StudioComponentActiveDirectoryComputerAttribute(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder value(@Nullable String value) {
            $.value = value;
            return this;
        }

        public StudioComponentActiveDirectoryComputerAttribute build() {
            return $;
        }
    }

}
