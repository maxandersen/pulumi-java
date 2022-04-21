// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Definition of the connection fields.
 * 
 */
public final class FieldDefinitionResponse extends com.pulumi.resources.InvokeArgs {

    public static final FieldDefinitionResponse Empty = new FieldDefinitionResponse();

    /**
     * Gets or sets the isEncrypted flag of the connection field definition.
     * 
     */
    @Import(name="isEncrypted")
    private @Nullable Boolean isEncrypted;

    public Optional<Boolean> isEncrypted() {
        return Optional.ofNullable(this.isEncrypted);
    }

    /**
     * Gets or sets the isOptional flag of the connection field definition.
     * 
     */
    @Import(name="isOptional")
    private @Nullable Boolean isOptional;

    public Optional<Boolean> isOptional() {
        return Optional.ofNullable(this.isOptional);
    }

    /**
     * Gets or sets the type of the connection field definition.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private FieldDefinitionResponse() {}

    private FieldDefinitionResponse(FieldDefinitionResponse $) {
        this.isEncrypted = $.isEncrypted;
        this.isOptional = $.isOptional;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FieldDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FieldDefinitionResponse $;

        public Builder() {
            $ = new FieldDefinitionResponse();
        }

        public Builder(FieldDefinitionResponse defaults) {
            $ = new FieldDefinitionResponse(Objects.requireNonNull(defaults));
        }

        public Builder isEncrypted(@Nullable Boolean isEncrypted) {
            $.isEncrypted = isEncrypted;
            return this;
        }

        public Builder isOptional(@Nullable Boolean isOptional) {
            $.isOptional = isOptional;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public FieldDefinitionResponse build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
