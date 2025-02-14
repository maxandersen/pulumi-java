// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.recaptcha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.recaptcha.EnterpriseKeyArgs;
import com.pulumi.gcp.recaptcha.inputs.EnterpriseKeyState;
import com.pulumi.gcp.recaptcha.outputs.EnterpriseKeyAndroidSettings;
import com.pulumi.gcp.recaptcha.outputs.EnterpriseKeyIosSettings;
import com.pulumi.gcp.recaptcha.outputs.EnterpriseKeyTestingOptions;
import com.pulumi.gcp.recaptcha.outputs.EnterpriseKeyWebSettings;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The RecaptchaEnterprise Key resource
 * 
 * ## Example Usage
 * ### Android_key
 * A basic test of recaptcha enterprise key that can be used by Android apps
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var primary = new EnterpriseKey(&#34;primary&#34;, EnterpriseKeyArgs.builder()        
 *             .androidSettings(EnterpriseKeyAndroidSettings.builder()
 *                 .allowAllPackageNames(true)
 *                 .allowedPackageNames()
 *                 .build())
 *             .displayName(&#34;display-name-one&#34;)
 *             .labels(Map.of(&#34;label-one&#34;, &#34;value-one&#34;))
 *             .project(&#34;my-project-name&#34;)
 *             .testingOptions(EnterpriseKeyTestingOptions.builder()
 *                 .testingScore(0.8)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Ios_key
 * A basic test of recaptcha enterprise key that can be used by iOS apps
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var primary = new EnterpriseKey(&#34;primary&#34;, EnterpriseKeyArgs.builder()        
 *             .displayName(&#34;display-name-one&#34;)
 *             .iosSettings(EnterpriseKeyIosSettings.builder()
 *                 .allowAllBundleIds(true)
 *                 .allowedBundleIds()
 *                 .build())
 *             .labels(Map.of(&#34;label-one&#34;, &#34;value-one&#34;))
 *             .project(&#34;my-project-name&#34;)
 *             .testingOptions(EnterpriseKeyTestingOptions.builder()
 *                 .testingScore(1)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Minimal_key
 * A minimal test of recaptcha enterprise key
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var primary = new EnterpriseKey(&#34;primary&#34;, EnterpriseKeyArgs.builder()        
 *             .displayName(&#34;display-name-one&#34;)
 *             .labels()
 *             .project(&#34;my-project-name&#34;)
 *             .webSettings(EnterpriseKeyWebSettings.builder()
 *                 .allowAllDomains(true)
 *                 .integrationType(&#34;SCORE&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Web_key
 * A basic test of recaptcha enterprise key that can be used by websites
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var primary = new EnterpriseKey(&#34;primary&#34;, EnterpriseKeyArgs.builder()        
 *             .displayName(&#34;display-name-one&#34;)
 *             .labels(Map.of(&#34;label-one&#34;, &#34;value-one&#34;))
 *             .project(&#34;my-project-name&#34;)
 *             .testingOptions(EnterpriseKeyTestingOptions.builder()
 *                 .testingChallenge(&#34;NOCAPTCHA&#34;)
 *                 .testingScore(0.5)
 *                 .build())
 *             .webSettings(EnterpriseKeyWebSettings.builder()
 *                 .allowAllDomains(true)
 *                 .allowedDomains()
 *                 .challengeSecurityPreference(&#34;USABILITY&#34;)
 *                 .integrationType(&#34;CHECKBOX&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Web_score_key
 * A basic test of recaptcha enterprise key with score integration type that can be used by websites
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var primary = new EnterpriseKey(&#34;primary&#34;, EnterpriseKeyArgs.builder()        
 *             .displayName(&#34;display-name-one&#34;)
 *             .labels(Map.of(&#34;label-one&#34;, &#34;value-one&#34;))
 *             .project(&#34;my-project-name&#34;)
 *             .testingOptions(EnterpriseKeyTestingOptions.builder()
 *                 .testingScore(0.5)
 *                 .build())
 *             .webSettings(EnterpriseKeyWebSettings.builder()
 *                 .allowAllDomains(true)
 *                 .allowAmpTraffic(false)
 *                 .allowedDomains()
 *                 .integrationType(&#34;SCORE&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Key can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:recaptcha/enterpriseKey:EnterpriseKey default projects/{{project}}/keys/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:recaptcha/enterpriseKey:EnterpriseKey default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:recaptcha/enterpriseKey:EnterpriseKey default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:recaptcha/enterpriseKey:EnterpriseKey")
public class EnterpriseKey extends com.pulumi.resources.CustomResource {
    /**
     * Settings for keys that can be used by Android apps.
     * 
     */
    @Export(name="androidSettings", type=EnterpriseKeyAndroidSettings.class, parameters={})
    private Output</* @Nullable */ EnterpriseKeyAndroidSettings> androidSettings;

    /**
     * @return Settings for keys that can be used by Android apps.
     * 
     */
    public Output<Optional<EnterpriseKeyAndroidSettings>> androidSettings() {
        return Codegen.optional(this.androidSettings);
    }
    /**
     * The timestamp corresponding to the creation of this Key.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The timestamp corresponding to the creation of this Key.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Human-readable display name of this key. Modifiable by user.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Human-readable display name of this key. Modifiable by user.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Settings for keys that can be used by iOS apps.
     * 
     */
    @Export(name="iosSettings", type=EnterpriseKeyIosSettings.class, parameters={})
    private Output</* @Nullable */ EnterpriseKeyIosSettings> iosSettings;

    /**
     * @return Settings for keys that can be used by iOS apps.
     * 
     */
    public Output<Optional<EnterpriseKeyIosSettings>> iosSettings() {
        return Codegen.optional(this.iosSettings);
    }
    /**
     * See [Creating and managing labels](https://cloud.google.com/recaptcha-enterprise/docs/labels).
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return See [Creating and managing labels](https://cloud.google.com/recaptcha-enterprise/docs/labels).
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The resource name for the Key in the format &#34;projects/{project}/keys/{key}&#34;.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name for the Key in the format &#34;projects/{project}/keys/{key}&#34;.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The project for the resource
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project for the resource
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * Options for user acceptance testing.
     * 
     */
    @Export(name="testingOptions", type=EnterpriseKeyTestingOptions.class, parameters={})
    private Output</* @Nullable */ EnterpriseKeyTestingOptions> testingOptions;

    /**
     * @return Options for user acceptance testing.
     * 
     */
    public Output<Optional<EnterpriseKeyTestingOptions>> testingOptions() {
        return Codegen.optional(this.testingOptions);
    }
    /**
     * Settings for keys that can be used by websites.
     * 
     */
    @Export(name="webSettings", type=EnterpriseKeyWebSettings.class, parameters={})
    private Output</* @Nullable */ EnterpriseKeyWebSettings> webSettings;

    /**
     * @return Settings for keys that can be used by websites.
     * 
     */
    public Output<Optional<EnterpriseKeyWebSettings>> webSettings() {
        return Codegen.optional(this.webSettings);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EnterpriseKey(String name) {
        this(name, EnterpriseKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EnterpriseKey(String name, EnterpriseKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EnterpriseKey(String name, EnterpriseKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:recaptcha/enterpriseKey:EnterpriseKey", name, args == null ? EnterpriseKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EnterpriseKey(String name, Output<String> id, @Nullable EnterpriseKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:recaptcha/enterpriseKey:EnterpriseKey", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static EnterpriseKey get(String name, Output<String> id, @Nullable EnterpriseKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EnterpriseKey(name, id, state, options);
    }
}
