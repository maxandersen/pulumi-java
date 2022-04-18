// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The location of file server dataset.
 * 
 */
public final class FileServerLocationResponse extends com.pulumi.resources.InvokeArgs {

    public static final FileServerLocationResponse Empty = new FileServerLocationResponse();

    /**
     * Specify the file name of dataset. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="fileName")
      private final @Nullable Object fileName;

    public Optional<Object> fileName() {
        return this.fileName == null ? Optional.empty() : Optional.ofNullable(this.fileName);
    }

    /**
     * Specify the folder path of dataset. Type: string (or Expression with resultType string)
     * 
     */
    @Import(name="folderPath")
      private final @Nullable Object folderPath;

    public Optional<Object> folderPath() {
        return this.folderPath == null ? Optional.empty() : Optional.ofNullable(this.folderPath);
    }

    /**
     * Type of dataset storage location.
     * Expected value is 'FileServerLocation'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public FileServerLocationResponse(
        @Nullable Object fileName,
        @Nullable Object folderPath,
        String type) {
        this.fileName = fileName;
        this.folderPath = folderPath;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private FileServerLocationResponse() {
        this.fileName = null;
        this.folderPath = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileServerLocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object fileName;
        private @Nullable Object folderPath;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(FileServerLocationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileName = defaults.fileName;
    	      this.folderPath = defaults.folderPath;
    	      this.type = defaults.type;
        }

        public Builder fileName(@Nullable Object fileName) {
            this.fileName = fileName;
            return this;
        }
        public Builder folderPath(@Nullable Object folderPath) {
            this.folderPath = folderPath;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public FileServerLocationResponse build() {
            return new FileServerLocationResponse(fileName, folderPath, type);
        }
    }
}
