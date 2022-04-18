// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.importexport.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A property containing information about the blobs to be exported for an export job. This property is required for export jobs, but must not be specified for import jobs.
 * 
 */
public final class ExportResponse extends com.pulumi.resources.InvokeArgs {

    public static final ExportResponse Empty = new ExportResponse();

    /**
     * The relative URI to the block blob that contains the list of blob paths or blob path prefixes as defined above, beginning with the container name. If the blob is in root container, the URI must begin with $root.
     * 
     */
    @Import(name="blobListBlobPath")
      private final @Nullable String blobListBlobPath;

    public Optional<String> blobListBlobPath() {
        return this.blobListBlobPath == null ? Optional.empty() : Optional.ofNullable(this.blobListBlobPath);
    }

    /**
     * A collection of blob-path strings.
     * 
     */
    @Import(name="blobPath")
      private final @Nullable List<String> blobPath;

    public List<String> blobPath() {
        return this.blobPath == null ? List.of() : this.blobPath;
    }

    /**
     * A collection of blob-prefix strings.
     * 
     */
    @Import(name="blobPathPrefix")
      private final @Nullable List<String> blobPathPrefix;

    public List<String> blobPathPrefix() {
        return this.blobPathPrefix == null ? List.of() : this.blobPathPrefix;
    }

    public ExportResponse(
        @Nullable String blobListBlobPath,
        @Nullable List<String> blobPath,
        @Nullable List<String> blobPathPrefix) {
        this.blobListBlobPath = blobListBlobPath;
        this.blobPath = blobPath;
        this.blobPathPrefix = blobPathPrefix;
    }

    private ExportResponse() {
        this.blobListBlobPath = null;
        this.blobPath = List.of();
        this.blobPathPrefix = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String blobListBlobPath;
        private @Nullable List<String> blobPath;
        private @Nullable List<String> blobPathPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobListBlobPath = defaults.blobListBlobPath;
    	      this.blobPath = defaults.blobPath;
    	      this.blobPathPrefix = defaults.blobPathPrefix;
        }

        public Builder blobListBlobPath(@Nullable String blobListBlobPath) {
            this.blobListBlobPath = blobListBlobPath;
            return this;
        }
        public Builder blobPath(@Nullable List<String> blobPath) {
            this.blobPath = blobPath;
            return this;
        }
        public Builder blobPath(String... blobPath) {
            return blobPath(List.of(blobPath));
        }
        public Builder blobPathPrefix(@Nullable List<String> blobPathPrefix) {
            this.blobPathPrefix = blobPathPrefix;
            return this;
        }
        public Builder blobPathPrefix(String... blobPathPrefix) {
            return blobPathPrefix(List.of(blobPathPrefix));
        }        public ExportResponse build() {
            return new ExportResponse(blobListBlobPath, blobPath, blobPathPrefix);
        }
    }
}
