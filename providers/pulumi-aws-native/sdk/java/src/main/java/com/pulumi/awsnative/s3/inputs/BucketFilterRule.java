// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies the Amazon S3 object key name to filter on and whether to filter on the suffix or prefix of the key name.
 * 
 */
public final class BucketFilterRule extends com.pulumi.resources.InvokeArgs {

    public static final BucketFilterRule Empty = new BucketFilterRule();

    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    @Import(name="value", required=true)
    private String value;

    public String value() {
        return this.value;
    }

    private BucketFilterRule() {}

    private BucketFilterRule(BucketFilterRule $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketFilterRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketFilterRule $;

        public Builder() {
            $ = new BucketFilterRule();
        }

        public Builder(BucketFilterRule defaults) {
            $ = new BucketFilterRule(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public BucketFilterRule build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
