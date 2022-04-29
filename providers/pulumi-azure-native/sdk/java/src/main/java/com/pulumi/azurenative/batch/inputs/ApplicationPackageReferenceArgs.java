// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationPackageReferenceArgs extends ResourceArgs {

    public static final ApplicationPackageReferenceArgs Empty = new ApplicationPackageReferenceArgs();

    @Import(name="id", required=true)
    private Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    /**
     * If this is omitted, and no default version is specified for this application, the request fails with the error code InvalidApplicationPackageReferences. If you are calling the REST API directly, the HTTP status code is 409.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return If this is omitted, and no default version is specified for this application, the request fails with the error code InvalidApplicationPackageReferences. If you are calling the REST API directly, the HTTP status code is 409.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private ApplicationPackageReferenceArgs() {}

    private ApplicationPackageReferenceArgs(ApplicationPackageReferenceArgs $) {
        this.id = $.id;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationPackageReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationPackageReferenceArgs $;

        public Builder() {
            $ = new ApplicationPackageReferenceArgs();
        }

        public Builder(ApplicationPackageReferenceArgs defaults) {
            $ = new ApplicationPackageReferenceArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param version If this is omitted, and no default version is specified for this application, the request fails with the error code InvalidApplicationPackageReferences. If you are calling the REST API directly, the HTTP status code is 409.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version If this is omitted, and no default version is specified for this application, the request fails with the error code InvalidApplicationPackageReferences. If you are calling the REST API directly, the HTTP status code is 409.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public ApplicationPackageReferenceArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
