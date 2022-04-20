// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.appengine.inputs.StandardAppVersionHandlerScriptGetArgs;
import com.pulumi.gcp.appengine.inputs.StandardAppVersionHandlerStaticFilesGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StandardAppVersionHandlerGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final StandardAppVersionHandlerGetArgs Empty = new StandardAppVersionHandlerGetArgs();

    /**
     * Actions to take when the user is not logged in.
     * Possible values are `AUTH_FAIL_ACTION_REDIRECT` and `AUTH_FAIL_ACTION_UNAUTHORIZED`.
     * 
     */
    @Import(name="authFailAction")
      private final @Nullable Output<String> authFailAction;

    public Output<String> authFailAction() {
        return this.authFailAction == null ? Codegen.empty() : this.authFailAction;
    }

    /**
     * Methods to restrict access to a URL based on login status.
     * Possible values are `LOGIN_OPTIONAL`, `LOGIN_ADMIN`, and `LOGIN_REQUIRED`.
     * 
     */
    @Import(name="login")
      private final @Nullable Output<String> login;

    public Output<String> login() {
        return this.login == null ? Codegen.empty() : this.login;
    }

    /**
     * 30x code to use when performing redirects for the secure field.
     * Possible values are `REDIRECT_HTTP_RESPONSE_CODE_301`, `REDIRECT_HTTP_RESPONSE_CODE_302`, `REDIRECT_HTTP_RESPONSE_CODE_303`, and `REDIRECT_HTTP_RESPONSE_CODE_307`.
     * 
     */
    @Import(name="redirectHttpResponseCode")
      private final @Nullable Output<String> redirectHttpResponseCode;

    public Output<String> redirectHttpResponseCode() {
        return this.redirectHttpResponseCode == null ? Codegen.empty() : this.redirectHttpResponseCode;
    }

    /**
     * Executes a script to handle the requests that match this URL pattern.
     * Only the auto value is supported for Node.js in the App Engine standard environment, for example &#34;script:&#34; &#34;auto&#34;.
     * Structure is documented below.
     * 
     */
    @Import(name="script")
      private final @Nullable Output<StandardAppVersionHandlerScriptGetArgs> script;

    public Output<StandardAppVersionHandlerScriptGetArgs> script() {
        return this.script == null ? Codegen.empty() : this.script;
    }

    /**
     * Security (HTTPS) enforcement for this URL.
     * Possible values are `SECURE_DEFAULT`, `SECURE_NEVER`, `SECURE_OPTIONAL`, and `SECURE_ALWAYS`.
     * 
     */
    @Import(name="securityLevel")
      private final @Nullable Output<String> securityLevel;

    public Output<String> securityLevel() {
        return this.securityLevel == null ? Codegen.empty() : this.securityLevel;
    }

    /**
     * Files served directly to the user for a given URL, such as images, CSS stylesheets, or JavaScript source files. Static file handlers describe which files in the application directory are static files, and which URLs serve them.
     * Structure is documented below.
     * 
     */
    @Import(name="staticFiles")
      private final @Nullable Output<StandardAppVersionHandlerStaticFilesGetArgs> staticFiles;

    public Output<StandardAppVersionHandlerStaticFilesGetArgs> staticFiles() {
        return this.staticFiles == null ? Codegen.empty() : this.staticFiles;
    }

    /**
     * URL prefix. Uses regular expression syntax, which means regexp special characters must be escaped, but should not contain groupings.
     * All URLs that begin with this prefix are handled by this handler, using the portion of the URL after the prefix as part of the file path.
     * 
     */
    @Import(name="urlRegex")
      private final @Nullable Output<String> urlRegex;

    public Output<String> urlRegex() {
        return this.urlRegex == null ? Codegen.empty() : this.urlRegex;
    }

    public StandardAppVersionHandlerGetArgs(
        @Nullable Output<String> authFailAction,
        @Nullable Output<String> login,
        @Nullable Output<String> redirectHttpResponseCode,
        @Nullable Output<StandardAppVersionHandlerScriptGetArgs> script,
        @Nullable Output<String> securityLevel,
        @Nullable Output<StandardAppVersionHandlerStaticFilesGetArgs> staticFiles,
        @Nullable Output<String> urlRegex) {
        this.authFailAction = authFailAction;
        this.login = login;
        this.redirectHttpResponseCode = redirectHttpResponseCode;
        this.script = script;
        this.securityLevel = securityLevel;
        this.staticFiles = staticFiles;
        this.urlRegex = urlRegex;
    }

    private StandardAppVersionHandlerGetArgs() {
        this.authFailAction = Codegen.empty();
        this.login = Codegen.empty();
        this.redirectHttpResponseCode = Codegen.empty();
        this.script = Codegen.empty();
        this.securityLevel = Codegen.empty();
        this.staticFiles = Codegen.empty();
        this.urlRegex = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardAppVersionHandlerGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> authFailAction;
        private @Nullable Output<String> login;
        private @Nullable Output<String> redirectHttpResponseCode;
        private @Nullable Output<StandardAppVersionHandlerScriptGetArgs> script;
        private @Nullable Output<String> securityLevel;
        private @Nullable Output<StandardAppVersionHandlerStaticFilesGetArgs> staticFiles;
        private @Nullable Output<String> urlRegex;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardAppVersionHandlerGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authFailAction = defaults.authFailAction;
    	      this.login = defaults.login;
    	      this.redirectHttpResponseCode = defaults.redirectHttpResponseCode;
    	      this.script = defaults.script;
    	      this.securityLevel = defaults.securityLevel;
    	      this.staticFiles = defaults.staticFiles;
    	      this.urlRegex = defaults.urlRegex;
        }

        public Builder authFailAction(@Nullable Output<String> authFailAction) {
            this.authFailAction = authFailAction;
            return this;
        }
        public Builder authFailAction(@Nullable String authFailAction) {
            this.authFailAction = Codegen.ofNullable(authFailAction);
            return this;
        }
        public Builder login(@Nullable Output<String> login) {
            this.login = login;
            return this;
        }
        public Builder login(@Nullable String login) {
            this.login = Codegen.ofNullable(login);
            return this;
        }
        public Builder redirectHttpResponseCode(@Nullable Output<String> redirectHttpResponseCode) {
            this.redirectHttpResponseCode = redirectHttpResponseCode;
            return this;
        }
        public Builder redirectHttpResponseCode(@Nullable String redirectHttpResponseCode) {
            this.redirectHttpResponseCode = Codegen.ofNullable(redirectHttpResponseCode);
            return this;
        }
        public Builder script(@Nullable Output<StandardAppVersionHandlerScriptGetArgs> script) {
            this.script = script;
            return this;
        }
        public Builder script(@Nullable StandardAppVersionHandlerScriptGetArgs script) {
            this.script = Codegen.ofNullable(script);
            return this;
        }
        public Builder securityLevel(@Nullable Output<String> securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Builder securityLevel(@Nullable String securityLevel) {
            this.securityLevel = Codegen.ofNullable(securityLevel);
            return this;
        }
        public Builder staticFiles(@Nullable Output<StandardAppVersionHandlerStaticFilesGetArgs> staticFiles) {
            this.staticFiles = staticFiles;
            return this;
        }
        public Builder staticFiles(@Nullable StandardAppVersionHandlerStaticFilesGetArgs staticFiles) {
            this.staticFiles = Codegen.ofNullable(staticFiles);
            return this;
        }
        public Builder urlRegex(@Nullable Output<String> urlRegex) {
            this.urlRegex = urlRegex;
            return this;
        }
        public Builder urlRegex(@Nullable String urlRegex) {
            this.urlRegex = Codegen.ofNullable(urlRegex);
            return this;
        }        public StandardAppVersionHandlerGetArgs build() {
            return new StandardAppVersionHandlerGetArgs(authFailAction, login, redirectHttpResponseCode, script, securityLevel, staticFiles, urlRegex);
        }
    }
}
