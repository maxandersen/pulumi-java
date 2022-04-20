// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WinRMListenerResponse {
    /**
     * This is the URL of a certificate that has been uploaded to Key Vault as a secret. For adding a secret to the Key Vault, see [Add a key or secret to the key vault](https://docs.microsoft.com/azure/key-vault/key-vault-get-started/#add). In this case, your certificate needs to be It is the Base64 encoding of the following JSON Object which is encoded in UTF-8: &lt;br&gt;&lt;br&gt; {&lt;br&gt; &#34;data&#34;:&#34;&lt;Base64-encoded-certificate&gt;&#34;,&lt;br&gt; &#34;dataType&#34;:&#34;pfx&#34;,&lt;br&gt; &#34;password&#34;:&#34;&lt;pfx-file-password&gt;&#34;&lt;br&gt;} &lt;br&gt; To install certificates on a virtual machine it is recommended to use the [Azure Key Vault virtual machine extension for Linux](https://docs.microsoft.com/azure/virtual-machines/extensions/key-vault-linux) or the [Azure Key Vault virtual machine extension for Windows](https://docs.microsoft.com/azure/virtual-machines/extensions/key-vault-windows).
     * 
     */
    private final @Nullable String certificateUrl;
    /**
     * Specifies the protocol of WinRM listener. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;**http** &lt;br&gt;&lt;br&gt; **https**
     * 
     */
    private final @Nullable String protocol;

    @CustomType.Constructor
    private WinRMListenerResponse(
        @CustomType.Parameter("certificateUrl") @Nullable String certificateUrl,
        @CustomType.Parameter("protocol") @Nullable String protocol) {
        this.certificateUrl = certificateUrl;
        this.protocol = protocol;
    }

    /**
     * This is the URL of a certificate that has been uploaded to Key Vault as a secret. For adding a secret to the Key Vault, see [Add a key or secret to the key vault](https://docs.microsoft.com/azure/key-vault/key-vault-get-started/#add). In this case, your certificate needs to be It is the Base64 encoding of the following JSON Object which is encoded in UTF-8: &lt;br&gt;&lt;br&gt; {&lt;br&gt; &#34;data&#34;:&#34;&lt;Base64-encoded-certificate&gt;&#34;,&lt;br&gt; &#34;dataType&#34;:&#34;pfx&#34;,&lt;br&gt; &#34;password&#34;:&#34;&lt;pfx-file-password&gt;&#34;&lt;br&gt;} &lt;br&gt; To install certificates on a virtual machine it is recommended to use the [Azure Key Vault virtual machine extension for Linux](https://docs.microsoft.com/azure/virtual-machines/extensions/key-vault-linux) or the [Azure Key Vault virtual machine extension for Windows](https://docs.microsoft.com/azure/virtual-machines/extensions/key-vault-windows).
     * 
    */
    public Optional<String> certificateUrl() {
        return Optional.ofNullable(this.certificateUrl);
    }
    /**
     * Specifies the protocol of WinRM listener. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;**http** &lt;br&gt;&lt;br&gt; **https**
     * 
    */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WinRMListenerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String certificateUrl;
        private @Nullable String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(WinRMListenerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateUrl = defaults.certificateUrl;
    	      this.protocol = defaults.protocol;
        }

        public Builder certificateUrl(@Nullable String certificateUrl) {
            this.certificateUrl = certificateUrl;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }        public WinRMListenerResponse build() {
            return new WinRMListenerResponse(certificateUrl, protocol);
        }
    }
}
