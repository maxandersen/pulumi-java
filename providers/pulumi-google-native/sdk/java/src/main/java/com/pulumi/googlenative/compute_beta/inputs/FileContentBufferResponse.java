// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FileContentBufferResponse extends com.pulumi.resources.InvokeArgs {

    public static final FileContentBufferResponse Empty = new FileContentBufferResponse();

    /**
     * The raw content in the secure keys file.
     * 
     */
    @Import(name="content", required=true)
    private String content;

    public String content() {
        return this.content;
    }

    /**
     * The file type of source file.
     * 
     */
    @Import(name="fileType", required=true)
    private String fileType;

    public String fileType() {
        return this.fileType;
    }

    private FileContentBufferResponse() {}

    private FileContentBufferResponse(FileContentBufferResponse $) {
        this.content = $.content;
        this.fileType = $.fileType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileContentBufferResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileContentBufferResponse $;

        public Builder() {
            $ = new FileContentBufferResponse();
        }

        public Builder(FileContentBufferResponse defaults) {
            $ = new FileContentBufferResponse(Objects.requireNonNull(defaults));
        }

        public Builder content(String content) {
            $.content = content;
            return this;
        }

        public Builder fileType(String fileType) {
            $.fileType = fileType;
            return this;
        }

        public FileContentBufferResponse build() {
            $.content = Objects.requireNonNull($.content, "expected parameter 'content' to be non-null");
            $.fileType = Objects.requireNonNull($.fileType, "expected parameter 'fileType' to be non-null");
            return $;
        }
    }

}
