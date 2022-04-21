// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class ExtensionResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExtensionResourceArgs Empty = new ExtensionResourceArgs();

    /**
     * Dictionary of the extension resource properties.
     * 
     */
    @Import(name="properties", required=true)
    private Output<Map<String,Object>> properties;

    public Output<Map<String,Object>> properties() {
        return this.properties;
    }

    /**
     * CloudFormation type name.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private ExtensionResourceArgs() {}

    private ExtensionResourceArgs(ExtensionResourceArgs $) {
        this.properties = $.properties;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExtensionResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExtensionResourceArgs $;

        public Builder() {
            $ = new ExtensionResourceArgs();
        }

        public Builder(ExtensionResourceArgs defaults) {
            $ = new ExtensionResourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder properties(Output<Map<String,Object>> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(Map<String,Object> properties) {
            return properties(Output.of(properties));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ExtensionResourceArgs build() {
            $.properties = Objects.requireNonNull($.properties, "expected parameter 'properties' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
