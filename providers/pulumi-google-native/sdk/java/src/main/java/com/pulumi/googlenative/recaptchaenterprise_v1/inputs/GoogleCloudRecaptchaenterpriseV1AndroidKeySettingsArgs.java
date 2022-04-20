// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.recaptchaenterprise_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Settings specific to keys that can be used by Android apps.
 * 
 */
public final class GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsArgs Empty = new GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsArgs();

    /**
     * If set to true, allowed_package_names are not enforced.
     * 
     */
    @Import(name="allowAllPackageNames")
      private final @Nullable Output<Boolean> allowAllPackageNames;

    public Output<Boolean> allowAllPackageNames() {
        return this.allowAllPackageNames == null ? Codegen.empty() : this.allowAllPackageNames;
    }

    /**
     * Android package names of apps allowed to use the key. Example: &#39;com.companyname.appname&#39;
     * 
     */
    @Import(name="allowedPackageNames")
      private final @Nullable Output<List<String>> allowedPackageNames;

    public Output<List<String>> allowedPackageNames() {
        return this.allowedPackageNames == null ? Codegen.empty() : this.allowedPackageNames;
    }

    public GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsArgs(
        @Nullable Output<Boolean> allowAllPackageNames,
        @Nullable Output<List<String>> allowedPackageNames) {
        this.allowAllPackageNames = allowAllPackageNames;
        this.allowedPackageNames = allowedPackageNames;
    }

    private GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsArgs() {
        this.allowAllPackageNames = Codegen.empty();
        this.allowedPackageNames = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowAllPackageNames;
        private @Nullable Output<List<String>> allowedPackageNames;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowAllPackageNames = defaults.allowAllPackageNames;
    	      this.allowedPackageNames = defaults.allowedPackageNames;
        }

        public Builder allowAllPackageNames(@Nullable Output<Boolean> allowAllPackageNames) {
            this.allowAllPackageNames = allowAllPackageNames;
            return this;
        }
        public Builder allowAllPackageNames(@Nullable Boolean allowAllPackageNames) {
            this.allowAllPackageNames = Codegen.ofNullable(allowAllPackageNames);
            return this;
        }
        public Builder allowedPackageNames(@Nullable Output<List<String>> allowedPackageNames) {
            this.allowedPackageNames = allowedPackageNames;
            return this;
        }
        public Builder allowedPackageNames(@Nullable List<String> allowedPackageNames) {
            this.allowedPackageNames = Codegen.ofNullable(allowedPackageNames);
            return this;
        }
        public Builder allowedPackageNames(String... allowedPackageNames) {
            return allowedPackageNames(List.of(allowedPackageNames));
        }        public GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsArgs build() {
            return new GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsArgs(allowAllPackageNames, allowedPackageNames);
        }
    }
}
