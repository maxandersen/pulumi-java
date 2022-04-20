// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.inputs.ContentKeyPolicyPlayReadyLicenseArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies a configuration for PlayReady licenses.
 * 
 */
public final class ContentKeyPolicyPlayReadyConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContentKeyPolicyPlayReadyConfigurationArgs Empty = new ContentKeyPolicyPlayReadyConfigurationArgs();

    /**
     * The PlayReady licenses.
     * 
     */
    @Import(name="licenses", required=true)
      private final Output<List<ContentKeyPolicyPlayReadyLicenseArgs>> licenses;

    public Output<List<ContentKeyPolicyPlayReadyLicenseArgs>> licenses() {
        return this.licenses;
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.ContentKeyPolicyPlayReadyConfiguration&#39;.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> odataType() {
        return this.odataType;
    }

    /**
     * The custom response data.
     * 
     */
    @Import(name="responseCustomData")
      private final @Nullable Output<String> responseCustomData;

    public Output<String> responseCustomData() {
        return this.responseCustomData == null ? Codegen.empty() : this.responseCustomData;
    }

    public ContentKeyPolicyPlayReadyConfigurationArgs(
        Output<List<ContentKeyPolicyPlayReadyLicenseArgs>> licenses,
        Output<String> odataType,
        @Nullable Output<String> responseCustomData) {
        this.licenses = Objects.requireNonNull(licenses, "expected parameter 'licenses' to be non-null");
        this.odataType = Codegen.stringProp("odataType").output().arg(odataType).require();
        this.responseCustomData = responseCustomData;
    }

    private ContentKeyPolicyPlayReadyConfigurationArgs() {
        this.licenses = Codegen.empty();
        this.odataType = Codegen.empty();
        this.responseCustomData = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyPlayReadyConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<ContentKeyPolicyPlayReadyLicenseArgs>> licenses;
        private Output<String> odataType;
        private @Nullable Output<String> responseCustomData;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyPlayReadyConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.licenses = defaults.licenses;
    	      this.odataType = defaults.odataType;
    	      this.responseCustomData = defaults.responseCustomData;
        }

        public Builder licenses(Output<List<ContentKeyPolicyPlayReadyLicenseArgs>> licenses) {
            this.licenses = Objects.requireNonNull(licenses);
            return this;
        }
        public Builder licenses(List<ContentKeyPolicyPlayReadyLicenseArgs> licenses) {
            this.licenses = Output.of(Objects.requireNonNull(licenses));
            return this;
        }
        public Builder licenses(ContentKeyPolicyPlayReadyLicenseArgs... licenses) {
            return licenses(List.of(licenses));
        }
        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }
        public Builder responseCustomData(@Nullable Output<String> responseCustomData) {
            this.responseCustomData = responseCustomData;
            return this;
        }
        public Builder responseCustomData(@Nullable String responseCustomData) {
            this.responseCustomData = Codegen.ofNullable(responseCustomData);
            return this;
        }        public ContentKeyPolicyPlayReadyConfigurationArgs build() {
            return new ContentKeyPolicyPlayReadyConfigurationArgs(licenses, odataType, responseCustomData);
        }
    }
}
