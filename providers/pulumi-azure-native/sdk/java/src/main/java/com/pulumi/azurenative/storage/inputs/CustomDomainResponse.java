// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The custom domain assigned to this storage account. This can be set via Update.
 * 
 */
public final class CustomDomainResponse extends com.pulumi.resources.InvokeArgs {

    public static final CustomDomainResponse Empty = new CustomDomainResponse();

    /**
     * Gets or sets the custom domain name assigned to the storage account. Name is the CNAME source.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Indicates whether indirect CName validation is enabled. Default value is false. This should only be set on updates.
     * 
     */
    @Import(name="useSubDomainName")
    private @Nullable Boolean useSubDomainName;

    public Optional<Boolean> useSubDomainName() {
        return Optional.ofNullable(this.useSubDomainName);
    }

    private CustomDomainResponse() {}

    private CustomDomainResponse(CustomDomainResponse $) {
        this.name = $.name;
        this.useSubDomainName = $.useSubDomainName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomDomainResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomDomainResponse $;

        public Builder() {
            $ = new CustomDomainResponse();
        }

        public Builder(CustomDomainResponse defaults) {
            $ = new CustomDomainResponse(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder useSubDomainName(@Nullable Boolean useSubDomainName) {
            $.useSubDomainName = useSubDomainName;
            return this;
        }

        public CustomDomainResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
