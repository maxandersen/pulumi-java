// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Retention tag
 * 
 */
public final class RetentionTagResponse extends com.pulumi.resources.InvokeArgs {

    public static final RetentionTagResponse Empty = new RetentionTagResponse();

    /**
     * Retention Tag version.
     * 
     */
    @Import(name="eTag", required=true)
    private String eTag;

    public String eTag() {
        return this.eTag;
    }

    /**
     * Retention Tag version.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    /**
     * Retention Tag Name to relate it to retention rule.
     * 
     */
    @Import(name="tagName", required=true)
    private String tagName;

    public String tagName() {
        return this.tagName;
    }

    private RetentionTagResponse() {}

    private RetentionTagResponse(RetentionTagResponse $) {
        this.eTag = $.eTag;
        this.id = $.id;
        this.tagName = $.tagName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RetentionTagResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RetentionTagResponse $;

        public Builder() {
            $ = new RetentionTagResponse();
        }

        public Builder(RetentionTagResponse defaults) {
            $ = new RetentionTagResponse(Objects.requireNonNull(defaults));
        }

        public Builder eTag(String eTag) {
            $.eTag = eTag;
            return this;
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public Builder tagName(String tagName) {
            $.tagName = tagName;
            return this;
        }

        public RetentionTagResponse build() {
            $.eTag = Objects.requireNonNull($.eTag, "expected parameter 'eTag' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.tagName = Objects.requireNonNull($.tagName, "expected parameter 'tagName' to be non-null");
            return $;
        }
    }

}
