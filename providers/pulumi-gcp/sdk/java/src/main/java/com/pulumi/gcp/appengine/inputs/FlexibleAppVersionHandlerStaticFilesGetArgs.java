// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlexibleAppVersionHandlerStaticFilesGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionHandlerStaticFilesGetArgs Empty = new FlexibleAppVersionHandlerStaticFilesGetArgs();

    /**
     * Whether files should also be uploaded as code data. By default, files declared in static file handlers are
     * uploaded as static data and are only served to end users; they cannot be read by the application. If enabled,
     * uploads are charged against both your code and static data storage resource quotas.
     * 
     */
    @Import(name="applicationReadable")
      private final @Nullable Output<Boolean> applicationReadable;

    public Output<Boolean> applicationReadable() {
        return this.applicationReadable == null ? Codegen.empty() : this.applicationReadable;
    }

    /**
     * Time a static file served by this handler should be cached by web proxies and browsers.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example &#34;3.5s&#34;.
     * Default is &#39;0s&#39;
     * 
     */
    @Import(name="expiration")
      private final @Nullable Output<String> expiration;

    public Output<String> expiration() {
        return this.expiration == null ? Codegen.empty() : this.expiration;
    }

    /**
     * HTTP headers to use for all responses from these URLs.
     * An object containing a list of &#34;key:value&#34; value pairs.&#34;.
     * 
     */
    @Import(name="httpHeaders")
      private final @Nullable Output<Map<String,String>> httpHeaders;

    public Output<Map<String,String>> httpHeaders() {
        return this.httpHeaders == null ? Codegen.empty() : this.httpHeaders;
    }

    /**
     * MIME type used to serve all files served by this handler.
     * Defaults to file-specific MIME types, which are derived from each file&#39;s filename extension.
     * 
     */
    @Import(name="mimeType")
      private final @Nullable Output<String> mimeType;

    public Output<String> mimeType() {
        return this.mimeType == null ? Codegen.empty() : this.mimeType;
    }

    /**
     * Path to the static files matched by the URL pattern, from the application root directory.
     * The path can refer to text matched in groupings in the URL pattern.
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> path() {
        return this.path == null ? Codegen.empty() : this.path;
    }

    /**
     * Whether this handler should match the request if the file referenced by the handler does not exist.
     * 
     */
    @Import(name="requireMatchingFile")
      private final @Nullable Output<Boolean> requireMatchingFile;

    public Output<Boolean> requireMatchingFile() {
        return this.requireMatchingFile == null ? Codegen.empty() : this.requireMatchingFile;
    }

    /**
     * Regular expression that matches the file paths for all files that should be referenced by this handler.
     * 
     */
    @Import(name="uploadPathRegex")
      private final @Nullable Output<String> uploadPathRegex;

    public Output<String> uploadPathRegex() {
        return this.uploadPathRegex == null ? Codegen.empty() : this.uploadPathRegex;
    }

    public FlexibleAppVersionHandlerStaticFilesGetArgs(
        @Nullable Output<Boolean> applicationReadable,
        @Nullable Output<String> expiration,
        @Nullable Output<Map<String,String>> httpHeaders,
        @Nullable Output<String> mimeType,
        @Nullable Output<String> path,
        @Nullable Output<Boolean> requireMatchingFile,
        @Nullable Output<String> uploadPathRegex) {
        this.applicationReadable = applicationReadable;
        this.expiration = expiration;
        this.httpHeaders = httpHeaders;
        this.mimeType = mimeType;
        this.path = path;
        this.requireMatchingFile = requireMatchingFile;
        this.uploadPathRegex = uploadPathRegex;
    }

    private FlexibleAppVersionHandlerStaticFilesGetArgs() {
        this.applicationReadable = Codegen.empty();
        this.expiration = Codegen.empty();
        this.httpHeaders = Codegen.empty();
        this.mimeType = Codegen.empty();
        this.path = Codegen.empty();
        this.requireMatchingFile = Codegen.empty();
        this.uploadPathRegex = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionHandlerStaticFilesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> applicationReadable;
        private @Nullable Output<String> expiration;
        private @Nullable Output<Map<String,String>> httpHeaders;
        private @Nullable Output<String> mimeType;
        private @Nullable Output<String> path;
        private @Nullable Output<Boolean> requireMatchingFile;
        private @Nullable Output<String> uploadPathRegex;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionHandlerStaticFilesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationReadable = defaults.applicationReadable;
    	      this.expiration = defaults.expiration;
    	      this.httpHeaders = defaults.httpHeaders;
    	      this.mimeType = defaults.mimeType;
    	      this.path = defaults.path;
    	      this.requireMatchingFile = defaults.requireMatchingFile;
    	      this.uploadPathRegex = defaults.uploadPathRegex;
        }

        public Builder applicationReadable(@Nullable Output<Boolean> applicationReadable) {
            this.applicationReadable = applicationReadable;
            return this;
        }
        public Builder applicationReadable(@Nullable Boolean applicationReadable) {
            this.applicationReadable = Codegen.ofNullable(applicationReadable);
            return this;
        }
        public Builder expiration(@Nullable Output<String> expiration) {
            this.expiration = expiration;
            return this;
        }
        public Builder expiration(@Nullable String expiration) {
            this.expiration = Codegen.ofNullable(expiration);
            return this;
        }
        public Builder httpHeaders(@Nullable Output<Map<String,String>> httpHeaders) {
            this.httpHeaders = httpHeaders;
            return this;
        }
        public Builder httpHeaders(@Nullable Map<String,String> httpHeaders) {
            this.httpHeaders = Codegen.ofNullable(httpHeaders);
            return this;
        }
        public Builder mimeType(@Nullable Output<String> mimeType) {
            this.mimeType = mimeType;
            return this;
        }
        public Builder mimeType(@Nullable String mimeType) {
            this.mimeType = Codegen.ofNullable(mimeType);
            return this;
        }
        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = Codegen.ofNullable(path);
            return this;
        }
        public Builder requireMatchingFile(@Nullable Output<Boolean> requireMatchingFile) {
            this.requireMatchingFile = requireMatchingFile;
            return this;
        }
        public Builder requireMatchingFile(@Nullable Boolean requireMatchingFile) {
            this.requireMatchingFile = Codegen.ofNullable(requireMatchingFile);
            return this;
        }
        public Builder uploadPathRegex(@Nullable Output<String> uploadPathRegex) {
            this.uploadPathRegex = uploadPathRegex;
            return this;
        }
        public Builder uploadPathRegex(@Nullable String uploadPathRegex) {
            this.uploadPathRegex = Codegen.ofNullable(uploadPathRegex);
            return this;
        }        public FlexibleAppVersionHandlerStaticFilesGetArgs build() {
            return new FlexibleAppVersionHandlerStaticFilesGetArgs(applicationReadable, expiration, httpHeaders, mimeType, path, requireMatchingFile, uploadPathRegex);
        }
    }
}
