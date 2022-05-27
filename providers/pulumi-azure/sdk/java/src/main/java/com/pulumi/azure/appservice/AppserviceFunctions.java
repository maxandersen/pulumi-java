// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.appservice.inputs.GetAppServiceArgs;
import com.pulumi.azure.appservice.inputs.GetAppServiceEnvironmentArgs;
import com.pulumi.azure.appservice.inputs.GetAppServicePlanArgs;
import com.pulumi.azure.appservice.inputs.GetCertificateArgs;
import com.pulumi.azure.appservice.inputs.GetCertificateOrderArgs;
import com.pulumi.azure.appservice.inputs.GetEnvironmentV3Args;
import com.pulumi.azure.appservice.inputs.GetFunctionAppArgs;
import com.pulumi.azure.appservice.inputs.GetFunctionAppHostKeysArgs;
import com.pulumi.azure.appservice.inputs.GetLinuxFunctionAppArgs;
import com.pulumi.azure.appservice.inputs.GetLinuxWebAppArgs;
import com.pulumi.azure.appservice.inputs.GetServicePlanArgs;
import com.pulumi.azure.appservice.inputs.GetSourceControlTokenArgs;
import com.pulumi.azure.appservice.inputs.GetWindowsFunctionAppArgs;
import com.pulumi.azure.appservice.inputs.GetWindowsWebAppArgs;
import com.pulumi.azure.appservice.outputs.GetAppServiceEnvironmentResult;
import com.pulumi.azure.appservice.outputs.GetAppServicePlanResult;
import com.pulumi.azure.appservice.outputs.GetAppServiceResult;
import com.pulumi.azure.appservice.outputs.GetCertificateOrderResult;
import com.pulumi.azure.appservice.outputs.GetCertificateResult;
import com.pulumi.azure.appservice.outputs.GetEnvironmentV3Result;
import com.pulumi.azure.appservice.outputs.GetFunctionAppHostKeysResult;
import com.pulumi.azure.appservice.outputs.GetFunctionAppResult;
import com.pulumi.azure.appservice.outputs.GetLinuxFunctionAppResult;
import com.pulumi.azure.appservice.outputs.GetLinuxWebAppResult;
import com.pulumi.azure.appservice.outputs.GetServicePlanResult;
import com.pulumi.azure.appservice.outputs.GetSourceControlTokenResult;
import com.pulumi.azure.appservice.outputs.GetWindowsFunctionAppResult;
import com.pulumi.azure.appservice.outputs.GetWindowsWebAppResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class AppserviceFunctions {
    /**
     * ## Example Usage
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
     *         final var example = Output.of(AppserviceFunctions.getAppService(GetAppServiceArgs.builder()
     *             .name(&#34;search-app-service&#34;)
     *             .resourceGroupName(&#34;search-service&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;appServiceId&#34;, example.apply(getAppServiceResult -&gt; getAppServiceResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAppServiceResult> getAppService(GetAppServiceArgs args) {
        return getAppService(args, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
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
     *         final var example = Output.of(AppserviceFunctions.getAppService(GetAppServiceArgs.builder()
     *             .name(&#34;search-app-service&#34;)
     *             .resourceGroupName(&#34;search-service&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;appServiceId&#34;, example.apply(getAppServiceResult -&gt; getAppServiceResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAppServiceResult> getAppService(GetAppServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:appservice/getAppService:getAppService", TypeShape.of(GetAppServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing App Service Environment.
     * 
     * ## Example Usage
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
     *         final var example = Output.of(AppserviceFunctions.getAppServiceEnvironment(GetAppServiceEnvironmentArgs.builder()
     *             .name(&#34;existing-ase&#34;)
     *             .resourceGroupName(&#34;existing-rg&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getAppServiceEnvironmentResult -&gt; getAppServiceEnvironmentResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAppServiceEnvironmentResult> getAppServiceEnvironment(GetAppServiceEnvironmentArgs args) {
        return getAppServiceEnvironment(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing App Service Environment.
     * 
     * ## Example Usage
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
     *         final var example = Output.of(AppserviceFunctions.getAppServiceEnvironment(GetAppServiceEnvironmentArgs.builder()
     *             .name(&#34;existing-ase&#34;)
     *             .resourceGroupName(&#34;existing-rg&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getAppServiceEnvironmentResult -&gt; getAppServiceEnvironmentResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAppServiceEnvironmentResult> getAppServiceEnvironment(GetAppServiceEnvironmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:appservice/getAppServiceEnvironment:getAppServiceEnvironment", TypeShape.of(GetAppServiceEnvironmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ## Example Usage
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
     *         final var example = Output.of(AppserviceFunctions.getAppServicePlan(GetAppServicePlanArgs.builder()
     *             .name(&#34;search-app-service-plan&#34;)
     *             .resourceGroupName(&#34;search-service&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;appServicePlanId&#34;, example.apply(getAppServicePlanResult -&gt; getAppServicePlanResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAppServicePlanResult> getAppServicePlan(GetAppServicePlanArgs args) {
        return getAppServicePlan(args, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
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
     *         final var example = Output.of(AppserviceFunctions.getAppServicePlan(GetAppServicePlanArgs.builder()
     *             .name(&#34;search-app-service-plan&#34;)
     *             .resourceGroupName(&#34;search-service&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;appServicePlanId&#34;, example.apply(getAppServicePlanResult -&gt; getAppServicePlanResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAppServicePlanResult> getAppServicePlan(GetAppServicePlanArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:appservice/getAppServicePlan:getAppServicePlan", TypeShape.of(GetAppServicePlanResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an App Service Certificate.
     * 
     * ## Example Usage
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
     *         final var example = Output.of(AppserviceFunctions.getCertificate(GetCertificateArgs.builder()
     *             .name(&#34;example-app-service-certificate&#34;)
     *             .resourceGroupName(&#34;example-rg&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;appServiceCertificateId&#34;, example.apply(getCertificateResult -&gt; getCertificateResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetCertificateResult> getCertificate(GetCertificateArgs args) {
        return getCertificate(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an App Service Certificate.
     * 
     * ## Example Usage
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
     *         final var example = Output.of(AppserviceFunctions.getCertificate(GetCertificateArgs.builder()
     *             .name(&#34;example-app-service-certificate&#34;)
     *             .resourceGroupName(&#34;example-rg&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;appServiceCertificateId&#34;, example.apply(getCertificateResult -&gt; getCertificateResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetCertificateResult> getCertificate(GetCertificateArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:appservice/getCertificate:getCertificate", TypeShape.of(GetCertificateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing App Service Certificate Order.
     * 
     * ## Example Usage
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
     *         final var example = Output.of(AppserviceFunctions.getCertificateOrder(GetCertificateOrderArgs.builder()
     *             .name(&#34;example-cert-order&#34;)
     *             .resourceGroupName(&#34;example-resources&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;certificateOrderId&#34;, example.apply(getCertificateOrderResult -&gt; getCertificateOrderResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetCertificateOrderResult> getCertificateOrder(GetCertificateOrderArgs args) {
        return getCertificateOrder(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing App Service Certificate Order.
     * 
     * ## Example Usage
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
     *         final var example = Output.of(AppserviceFunctions.getCertificateOrder(GetCertificateOrderArgs.builder()
     *             .name(&#34;example-cert-order&#34;)
     *             .resourceGroupName(&#34;example-resources&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;certificateOrderId&#34;, example.apply(getCertificateOrderResult -&gt; getCertificateOrderResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetCertificateOrderResult> getCertificateOrder(GetCertificateOrderArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:appservice/getCertificateOrder:getCertificateOrder", TypeShape.of(GetCertificateOrderResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing 3rd Generation (v3) App Service Environment.
     * 
     * ## Example Usage
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
     *         final var example = Output.of(AppserviceFunctions.getEnvironmentV3(GetEnvironmentV3Args.builder()
     *             .name(&#34;example-ASE&#34;)
     *             .resourceGroupName(&#34;example-resource-group&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getEnvironmentV3Result -&gt; getEnvironmentV3Result.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetEnvironmentV3Result> getEnvironmentV3(GetEnvironmentV3Args args) {
        return getEnvironmentV3(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing 3rd Generation (v3) App Service Environment.
     * 
     * ## Example Usage
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
     *         final var example = Output.of(AppserviceFunctions.getEnvironmentV3(GetEnvironmentV3Args.builder()
     *             .name(&#34;example-ASE&#34;)
     *             .resourceGroupName(&#34;example-resource-group&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getEnvironmentV3Result -&gt; getEnvironmentV3Result.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetEnvironmentV3Result> getEnvironmentV3(GetEnvironmentV3Args args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:appservice/getEnvironmentV3:getEnvironmentV3", TypeShape.of(GetEnvironmentV3Result.class), args, Utilities.withVersion(options));
    }
    /**
     * ## Example Usage
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
     *         final var example = Output.of(AppserviceFunctions.getFunctionApp(GetFunctionAppArgs.builder()
     *             .name(&#34;test-azure-functions&#34;)
     *             .resourceGroupName(azurerm_resource_group.getExample().getName())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetFunctionAppResult> getFunctionApp(GetFunctionAppArgs args) {
        return getFunctionApp(args, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
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
     *         final var example = Output.of(AppserviceFunctions.getFunctionApp(GetFunctionAppArgs.builder()
     *             .name(&#34;test-azure-functions&#34;)
     *             .resourceGroupName(azurerm_resource_group.getExample().getName())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetFunctionAppResult> getFunctionApp(GetFunctionAppArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:appservice/getFunctionApp:getFunctionApp", TypeShape.of(GetFunctionAppResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to fetch the Host Keys of an existing Function App
     * 
     * ## Example Usage
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
     *         final var example = Output.of(AppserviceFunctions.getFunctionAppHostKeys(GetFunctionAppHostKeysArgs.builder()
     *             .name(&#34;example-function&#34;)
     *             .resourceGroupName(azurerm_resource_group.getExample().getName())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetFunctionAppHostKeysResult> getFunctionAppHostKeys(GetFunctionAppHostKeysArgs args) {
        return getFunctionAppHostKeys(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to fetch the Host Keys of an existing Function App
     * 
     * ## Example Usage
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
     *         final var example = Output.of(AppserviceFunctions.getFunctionAppHostKeys(GetFunctionAppHostKeysArgs.builder()
     *             .name(&#34;example-function&#34;)
     *             .resourceGroupName(azurerm_resource_group.getExample().getName())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetFunctionAppHostKeysResult> getFunctionAppHostKeys(GetFunctionAppHostKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:appservice/getFunctionAppHostKeys:getFunctionAppHostKeys", TypeShape.of(GetFunctionAppHostKeysResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Linux Function App.
     * 
     * ## Example Usage
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
     *         final var example = Output.of(AppserviceFunctions.getLinuxFunctionApp(GetLinuxFunctionAppArgs.builder()
     *             .name(&#34;existing&#34;)
     *             .resourceGroupName(&#34;existing&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, data.getLinux_function_app().getExample().getId());
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetLinuxFunctionAppResult> getLinuxFunctionApp(GetLinuxFunctionAppArgs args) {
        return getLinuxFunctionApp(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Linux Function App.
     * 
     * ## Example Usage
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
     *         final var example = Output.of(AppserviceFunctions.getLinuxFunctionApp(GetLinuxFunctionAppArgs.builder()
     *             .name(&#34;existing&#34;)
     *             .resourceGroupName(&#34;existing&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, data.getLinux_function_app().getExample().getId());
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetLinuxFunctionAppResult> getLinuxFunctionApp(GetLinuxFunctionAppArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:appservice/getLinuxFunctionApp:getLinuxFunctionApp", TypeShape.of(GetLinuxFunctionAppResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Linux Web App.
     * 
     * ## Example Usage
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
     *         final var example = Output.of(AppserviceFunctions.getLinuxWebApp(GetLinuxWebAppArgs.builder()
     *             .name(&#34;existing&#34;)
     *             .resourceGroupName(&#34;existing&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getLinuxWebAppResult -&gt; getLinuxWebAppResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetLinuxWebAppResult> getLinuxWebApp(GetLinuxWebAppArgs args) {
        return getLinuxWebApp(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Linux Web App.
     * 
     * ## Example Usage
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
     *         final var example = Output.of(AppserviceFunctions.getLinuxWebApp(GetLinuxWebAppArgs.builder()
     *             .name(&#34;existing&#34;)
     *             .resourceGroupName(&#34;existing&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getLinuxWebAppResult -&gt; getLinuxWebAppResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetLinuxWebAppResult> getLinuxWebApp(GetLinuxWebAppArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:appservice/getLinuxWebApp:getLinuxWebApp", TypeShape.of(GetLinuxWebAppResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Service Plan.
     * 
     * ## Example Usage
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
     *         final var example = Output.of(AppserviceFunctions.getServicePlan(GetServicePlanArgs.builder()
     *             .name(&#34;existing&#34;)
     *             .resourceGroupName(&#34;existing&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getServicePlanResult -&gt; getServicePlanResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetServicePlanResult> getServicePlan(GetServicePlanArgs args) {
        return getServicePlan(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Service Plan.
     * 
     * ## Example Usage
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
     *         final var example = Output.of(AppserviceFunctions.getServicePlan(GetServicePlanArgs.builder()
     *             .name(&#34;existing&#34;)
     *             .resourceGroupName(&#34;existing&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getServicePlanResult -&gt; getServicePlanResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetServicePlanResult> getServicePlan(GetServicePlanArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:appservice/getServicePlan:getServicePlan", TypeShape.of(GetServicePlanResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ## Example Usage
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
     *         final var example = Output.of(AppserviceFunctions.getSourceControlToken(GetSourceControlTokenArgs.builder()
     *             .type(&#34;GitHub&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, data.getAzurerm_app_service_github_token().getExample().getId());
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSourceControlTokenResult> getSourceControlToken(GetSourceControlTokenArgs args) {
        return getSourceControlToken(args, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
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
     *         final var example = Output.of(AppserviceFunctions.getSourceControlToken(GetSourceControlTokenArgs.builder()
     *             .type(&#34;GitHub&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, data.getAzurerm_app_service_github_token().getExample().getId());
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSourceControlTokenResult> getSourceControlToken(GetSourceControlTokenArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:appservice/getSourceControlToken:getSourceControlToken", TypeShape.of(GetSourceControlTokenResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Windows Function App.
     * 
     * ## Example Usage
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
     *         final var example = Output.of(AppserviceFunctions.getWindowsFunctionApp(GetWindowsFunctionAppArgs.builder()
     *             .name(&#34;existing&#34;)
     *             .resourceGroupName(&#34;existing&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getWindowsFunctionAppResult -&gt; getWindowsFunctionAppResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetWindowsFunctionAppResult> getWindowsFunctionApp(GetWindowsFunctionAppArgs args) {
        return getWindowsFunctionApp(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Windows Function App.
     * 
     * ## Example Usage
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
     *         final var example = Output.of(AppserviceFunctions.getWindowsFunctionApp(GetWindowsFunctionAppArgs.builder()
     *             .name(&#34;existing&#34;)
     *             .resourceGroupName(&#34;existing&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getWindowsFunctionAppResult -&gt; getWindowsFunctionAppResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetWindowsFunctionAppResult> getWindowsFunctionApp(GetWindowsFunctionAppArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:appservice/getWindowsFunctionApp:getWindowsFunctionApp", TypeShape.of(GetWindowsFunctionAppResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Windows Web App.
     * 
     * ## Example Usage
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
     *         final var example = Output.of(AppserviceFunctions.getWindowsWebApp(GetWindowsWebAppArgs.builder()
     *             .name(&#34;existing&#34;)
     *             .resourceGroupName(&#34;existing&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getWindowsWebAppResult -&gt; getWindowsWebAppResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetWindowsWebAppResult> getWindowsWebApp(GetWindowsWebAppArgs args) {
        return getWindowsWebApp(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Windows Web App.
     * 
     * ## Example Usage
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
     *         final var example = Output.of(AppserviceFunctions.getWindowsWebApp(GetWindowsWebAppArgs.builder()
     *             .name(&#34;existing&#34;)
     *             .resourceGroupName(&#34;existing&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getWindowsWebAppResult -&gt; getWindowsWebAppResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetWindowsWebAppResult> getWindowsWebApp(GetWindowsWebAppArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:appservice/getWindowsWebApp:getWindowsWebApp", TypeShape.of(GetWindowsWebAppResult.class), args, Utilities.withVersion(options));
    }
}
