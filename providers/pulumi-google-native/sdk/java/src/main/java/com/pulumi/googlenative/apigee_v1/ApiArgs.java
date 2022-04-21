// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiArgs Empty = new ApiArgs();

    @Import(name="action")
    private @Nullable Output<String> action;

    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * The HTTP Content-Type header value specifying the content type of the body.
     * 
     */
    @Import(name="contentType")
    private @Nullable Output<String> contentType;

    public Optional<Output<String>> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    /**
     * The HTTP request/response body as raw binary.
     * 
     */
    @Import(name="data")
    private @Nullable Output<String> data;

    public Optional<Output<String>> data() {
        return Optional.ofNullable(this.data);
    }

    /**
     * Application specific response metadata. Must be set in the first response for streaming APIs.
     * 
     */
    @Import(name="extensions")
    private @Nullable Output<List<Map<String,String>>> extensions;

    public Optional<Output<List<Map<String,String>>>> extensions() {
        return Optional.ofNullable(this.extensions);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    @Import(name="validate")
    private @Nullable Output<String> validate;

    public Optional<Output<String>> validate() {
        return Optional.ofNullable(this.validate);
    }

    private ApiArgs() {}

    private ApiArgs(ApiArgs $) {
        this.action = $.action;
        this.contentType = $.contentType;
        this.data = $.data;
        this.extensions = $.extensions;
        this.name = $.name;
        this.organizationId = $.organizationId;
        this.validate = $.validate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiArgs $;

        public Builder() {
            $ = new ApiArgs();
        }

        public Builder(ApiArgs defaults) {
            $ = new ApiArgs(Objects.requireNonNull(defaults));
        }

        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        public Builder action(String action) {
            return action(Output.of(action));
        }

        public Builder contentType(@Nullable Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        public Builder data(@Nullable Output<String> data) {
            $.data = data;
            return this;
        }

        public Builder data(String data) {
            return data(Output.of(data));
        }

        public Builder extensions(@Nullable Output<List<Map<String,String>>> extensions) {
            $.extensions = extensions;
            return this;
        }

        public Builder extensions(List<Map<String,String>> extensions) {
            return extensions(Output.of(extensions));
        }

        public Builder extensions(Map<String,String>... extensions) {
            return extensions(List.of(extensions));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public Builder validate(@Nullable Output<String> validate) {
            $.validate = validate;
            return this;
        }

        public Builder validate(String validate) {
            return validate(Output.of(validate));
        }

        public ApiArgs build() {
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}
