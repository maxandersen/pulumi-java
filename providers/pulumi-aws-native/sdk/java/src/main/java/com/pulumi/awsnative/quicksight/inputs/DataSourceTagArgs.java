// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * &lt;p&gt;The key or keys of the key-value pairs for the resource tag or tags assigned to the
 *             resource.&lt;/p&gt;
 * 
 */
public final class DataSourceTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceTagArgs Empty = new DataSourceTagArgs();

    /**
     * &lt;p&gt;Tag key.&lt;/p&gt;
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    /**
     * &lt;p&gt;Tag value.&lt;/p&gt;
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private DataSourceTagArgs() {}

    private DataSourceTagArgs(DataSourceTagArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceTagArgs $;

        public Builder() {
            $ = new DataSourceTagArgs();
        }

        public Builder(DataSourceTagArgs defaults) {
            $ = new DataSourceTagArgs(Objects.requireNonNull(defaults));
        }

        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public DataSourceTagArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
