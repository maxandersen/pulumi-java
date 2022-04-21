// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Azure Data Factory secure string definition. The string value will be masked with asterisks &#39;*&#39; during Get or List API calls.
 * 
 */
public final class SecureStringArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecureStringArgs Empty = new SecureStringArgs();

    /**
     * Type of the secret.
     * Expected value is &#39;SecureString&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Value of secure string.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private SecureStringArgs() {}

    private SecureStringArgs(SecureStringArgs $) {
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecureStringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecureStringArgs $;

        public Builder() {
            $ = new SecureStringArgs();
        }

        public Builder(SecureStringArgs defaults) {
            $ = new SecureStringArgs(Objects.requireNonNull(defaults));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public SecureStringArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
