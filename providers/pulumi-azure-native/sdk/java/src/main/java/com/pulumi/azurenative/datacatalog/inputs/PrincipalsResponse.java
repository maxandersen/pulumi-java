// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datacatalog.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * User principals.
 * 
 */
public final class PrincipalsResponse extends com.pulumi.resources.InvokeArgs {

    public static final PrincipalsResponse Empty = new PrincipalsResponse();

    /**
     * Object Id for the user
     * 
     */
    @Import(name="objectId")
    private @Nullable String objectId;

    public Optional<String> objectId() {
        return Optional.ofNullable(this.objectId);
    }

    /**
     * UPN of the user.
     * 
     */
    @Import(name="upn")
    private @Nullable String upn;

    public Optional<String> upn() {
        return Optional.ofNullable(this.upn);
    }

    private PrincipalsResponse() {}

    private PrincipalsResponse(PrincipalsResponse $) {
        this.objectId = $.objectId;
        this.upn = $.upn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrincipalsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrincipalsResponse $;

        public Builder() {
            $ = new PrincipalsResponse();
        }

        public Builder(PrincipalsResponse defaults) {
            $ = new PrincipalsResponse(Objects.requireNonNull(defaults));
        }

        public Builder objectId(@Nullable String objectId) {
            $.objectId = objectId;
            return this;
        }

        public Builder upn(@Nullable String upn) {
            $.upn = upn;
            return this;
        }

        public PrincipalsResponse build() {
            return $;
        }
    }

}
