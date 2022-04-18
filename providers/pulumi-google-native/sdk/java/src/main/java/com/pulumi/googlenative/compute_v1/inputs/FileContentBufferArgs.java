// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.compute_v1.enums.FileContentBufferFileType;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FileContentBufferArgs extends com.pulumi.resources.ResourceArgs {

    public static final FileContentBufferArgs Empty = new FileContentBufferArgs();

    /**
     * The raw content in the secure keys file.
     * 
     */
    @Import(name="content")
      private final @Nullable Output<String> content;

    public Output<String> content() {
        return this.content == null ? Codegen.empty() : this.content;
    }

    /**
     * The file type of source file.
     * 
     */
    @Import(name="fileType")
      private final @Nullable Output<FileContentBufferFileType> fileType;

    public Output<FileContentBufferFileType> fileType() {
        return this.fileType == null ? Codegen.empty() : this.fileType;
    }

    public FileContentBufferArgs(
        @Nullable Output<String> content,
        @Nullable Output<FileContentBufferFileType> fileType) {
        this.content = content;
        this.fileType = fileType;
    }

    private FileContentBufferArgs() {
        this.content = Codegen.empty();
        this.fileType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileContentBufferArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> content;
        private @Nullable Output<FileContentBufferFileType> fileType;

        public Builder() {
    	      // Empty
        }

        public Builder(FileContentBufferArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.fileType = defaults.fileType;
        }

        public Builder content(@Nullable Output<String> content) {
            this.content = content;
            return this;
        }
        public Builder content(@Nullable String content) {
            this.content = Codegen.ofNullable(content);
            return this;
        }
        public Builder fileType(@Nullable Output<FileContentBufferFileType> fileType) {
            this.fileType = fileType;
            return this;
        }
        public Builder fileType(@Nullable FileContentBufferFileType fileType) {
            this.fileType = Codegen.ofNullable(fileType);
            return this;
        }        public FileContentBufferArgs build() {
            return new FileContentBufferArgs(content, fileType);
        }
    }
}
